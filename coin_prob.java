
public class coin_prob {
	long numberOfPath(int n, int k, int [][]arr) {
        // code here
		long dp[][][]=new long[n][n][k+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int l=0;l<=k;l++) {
					dp[i][j][l]=-1;
				}
			}
		}
		return helper(0, 0, n, k,0, arr, dp);
    }
long helper(int i,int j,int n,int k,int v,int a[][],long dp[][][]) {
	long ans=0;
	return dp[i][j][v]=ans;
}
}
