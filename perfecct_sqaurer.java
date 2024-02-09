import java.util.Arrays;

public class perfecct_sqaurer {

	 public int numSquares(int n) {
	        int dp[]=new int[n+1];
	        Arrays.fill(dp, Integer.MAX_VALUE);
	        int c=1;
	        dp[0]=0;
	        while(c*c<=n) {
	        	int s=c*c;
	        	for(int i=s;i<=n;i++) {
	        		dp[i]=Math.min(dp[i-s]+1, dp[i]);
	        	}
	        	c++;
	        }
	        return dp[n];
	    }
	  public int numSqunares(int n) {
	         int sqrt = (int) Math.sqrt(n);

	        if (sqrt * sqrt == n)
	            return 1;

	        while (n % 4 == 0)
	            n = n / 4;

	        if (n % 8 == 7) return 4;

	        for (int i = 1; i * i <= n; i++) {
	            int square = i * i;
	            int base = (int) Math.sqrt(n - square);

	            if (base * base == n - square) return 2;
	        }

	        return 3;
	    }
	}
