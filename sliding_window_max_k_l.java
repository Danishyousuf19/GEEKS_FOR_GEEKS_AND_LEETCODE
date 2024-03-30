
public class sliding_window_max_k_l {
	public long countSubarrays(int[] nums, int k) {
		long max = Long.MIN_VALUE, c = 0;
		;
		long l = 0, r = 0, ans = 0;
		for (int i : nums) {
			max = Math.max(max, i);
		}
		while (r < nums.length) {
			if (nums[(int) r] == max) {
				c += 1;
			}
			while (c >= k) {
				if (nums[(int) l] == max) {
					c--;
				}
				l++;
				ans += nums.length - r;
			}
			r++;
		}
		return ans;
	}
}
