
public class find_1st_and_last_position_of_element {
	public int[] searchRange(int[] nums, int t) {
		int a[] = { -1, -1 };
		int li = find(nums, t, true);
		int ri = find(nums, t, false);
		if (li <= ri)
			return new int[] { li, ri };
		else
			return a;
	}

	static int find(int a[], int t, boolean findl) {
		int i = -1;
		int s = 0;
		int e = a.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (a[mid] == t) {
				i = mid;
				if (findl) {
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			}
			else if(a[mid]<t) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		}
		return i;
	}
}
