
public class CoinChange {
	//c=coins
	 public long count(int c[], int n, int s) {
	       long dp[]=new long[s+1];
	       dp[0]=1;
	       for(int co:c) {
	    	   for(int i=co;i<=s;i++) {
	    		   dp[i]=dp[i-co];
	    	   }
	       }
	       return dp[s];
	    }
}
