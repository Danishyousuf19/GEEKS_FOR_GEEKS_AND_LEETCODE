
public class gold_mine {
	  static int maxGold(int n, int m, int M[][])
	    {
	        // code here
	        int dp[][]=new int[n+1][m+1];
	         int a=dp[0][0];
	        for(int j=m-1;j>=0;j--){
	            for(int i=n-1;i>=0;i--){
	                if(i-1>=0)
	                dp[i][j]=M[i][j]+Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));
	                else
	                dp[i][j]=M[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
	                a=Math.max(dp[i][0],a);
	            }
	            
	        }
	       return a;
	    }
}
