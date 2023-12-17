
public class alt_sum {
    int findMaxSum(int arr[], int n) {
        // code here
        if(n==1)return arr[0];
        int dp[]=new int [n+1];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],arr[0]);
        dp[2]=Math.max(dp[0]+arr[2],dp[1]);
        for(int i=3;i<n;i++){
         dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);   
        }
        return dp[n-1];
    }
}
