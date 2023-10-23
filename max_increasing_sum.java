
public class max_increasing_sum {
	public int maxSumIS(int arr[], int n) {
		int dp[] = new int[n];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			dp[i] = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], arr[i] + dp[j]);
				}
			}
			max=Math.max(max, dp[i]);

		}
		return max;
	}

}
