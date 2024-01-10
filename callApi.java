
public class callApi {
	/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); */
class VersionControl{
	boolean isBadVersion(int s) {
		return s%2==0;
	}
}
class Solution extends VersionControl {
  public int firstBadVersion(int n) {
      int l = 1;
      int h = n;
      int mid = l + (h - l) / 2;
      while (l < h) {
          mid = l + (h - l) / 2;
          if (isBadVersion(mid)) {
              h = mid;
          } else {
              l = mid + 1;
          }
      }
      return l;
  }
}
}
