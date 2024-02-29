
public class common_element {
	class Solution {
	    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

	           int[] s1 = new int[101];
	        int[] s2 = new int[101];
	        for (int i = 0; i <nums1.length ; i++) {
	            s1[nums1[i]] = 1;
	        }
	        for (int i = 0; i < nums2.length; i++) {
	            s2[nums2[i]] = 1;
	        }
	        int[] ans = new int[2];
	        for (int i = 0; i <nums1.length ; i++) {
	            ans[0] += s2[nums1[i]];
	        }
	        for (int i = 0; i <nums2.length ; i++) {
	            ans[1] += s1[nums2[i]];
	        }
	    return ans;
	    }
	}
}
