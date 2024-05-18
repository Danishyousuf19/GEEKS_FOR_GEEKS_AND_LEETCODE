
public class no_o_ways {
	 public static int ways(int n, int m)
	    {
	        int dp[][]=new int[n+1][m+1];
	        for(int i=0;i<n+1;i++){
	            dp[i][0]=1;
	        }
	        for(int j=0;j<m+1;j++){
	            dp[0][j]=1;
	        }
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                dp[i][j]=(dp[i-1][j]+dp[i][j-1])%100000007;
	            }
	        }
	        return dp[n][m];
	        // complete the function
	    }
}
