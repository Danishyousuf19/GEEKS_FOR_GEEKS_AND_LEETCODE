
public class max_profit {
	public int maxProfit(int[] prices) {
		int min = prices[0];
		int n = prices.length;
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
			int t = prices[i] - min;
			if (max < t) {
				max = t;
			}

		}
		return max;
	}
}
