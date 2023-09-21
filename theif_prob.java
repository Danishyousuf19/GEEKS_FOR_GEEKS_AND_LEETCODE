
public class theif_prob {
	 public int FindMaxSum(int arr[], int n)
	    {
	        if(n == 1){
	            return arr[0];
	        }
	        
	        // Your code here
	        int dp[] = new int[n];
	        dp[0] = arr[0];
	        dp[1] = Math.max(arr[0], arr[1]);
	        
	        for(int i = 2; i<n;i++){
	            int ans1 = arr[i] + dp[i - 2];
	            int ans2 = dp[i-1];
	            
	            dp[i] = Math.max(ans1, ans2);
	        }
	        
	        return dp[n-1];
	    }
}
