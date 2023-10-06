
public class intger_break {
	
	    public int inte(int n) {
	        if (n <= 1) {
	            return 0;
	        }
	        if (n == 2) {
	            return 1;
	        }
	        if (n == 3) {
	            return 2;
	        }
	        int quotient = n / 3;
	        int remainder = n % 3;
	        if (remainder == 0) {
	            return (int) Math.pow(3, quotient);
	        } else if (remainder == 1) {
	            return (int) (Math.pow(3, quotient - 1) * 4);
	        } else {
	            return (int) (Math.pow(3, quotient) * 2);
	        }
	    }
	    public int integerBreak(int n) {
	      if(n<=1)return 0; 
	      if(n<=3)return n-1;
	      int ans=1;
	      while(n>4) {
	    	  ans*=3;
	    	  n-=3;
	      }
	      ans*=n;
	      return ans;
	    }
	    class Solution {
	        public int integerBreak(int n) {
	            if (n <= 1) {
	                return 0;
	            }
	            int[] dp = new int[n + 1];
	            dp[1] = 1;
	            for (int i = 2; i <= n; i++) {
	                for (int j = 1; j < i; j++) {
	                    dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
	                }
	            }
	            return dp[n];
	        }
	    }
}
