
public class shorter_subseq {
	public static int shortestCommonSupersequence(String x, String y, int m, int n) {
	    int[][] dp = new int[m + 1][n + 1]; // Fix the dimensions

	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (x.charAt(i - 1) == y.charAt(j - 1))
	                dp[i][j] = 1 + dp[i - 1][j - 1];
	            else
	                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	        }
	    }

	    return m + n - dp[m][n];
	}

}
