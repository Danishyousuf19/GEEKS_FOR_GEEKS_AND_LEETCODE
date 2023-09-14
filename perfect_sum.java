
public class perfect_sum{
	public int perfectSum(int arr[],int n, int sum) 
	{
	    int dp[]=new int [sum+1];
	    dp[0]=1;
	    for(int a:arr) {
	    	for(int curr=sum;curr>=a;curr--) {
	    		dp[curr]=(dp[curr]+dp[curr-a])%1000000007;
	    	}
	    }
	    return dp[sum]; 
	    // Your code goes here
	} 
}
