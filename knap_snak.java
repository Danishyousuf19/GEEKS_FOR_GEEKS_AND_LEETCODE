
public class knap_snak {
	static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    
}
