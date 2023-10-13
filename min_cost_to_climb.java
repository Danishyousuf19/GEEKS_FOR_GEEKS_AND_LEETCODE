
public class min_cost_to_climb {
//	brute force
public int minCostClimbingStairs1(int[] cost) {
        return Math.min(find(cost,0), find(cost,1));
    }
static int find(int arr[],int i)
{
	if(i>arr.length)return 0;
	return arr[i]+Math.min(find(arr,i+1),find(arr,i+2));
}
// dynamic programming
public int minCostClimbingStairs2(int[] cost) {
	int n=cost.length;
  int dp[]=new int[n];
  dp[0]=cost[0];
  dp[1]=cost[1];
  for(int i=2;i<n-1;i++) {
	  dp[i]=cost[i]+Math.min(dp[i-1], dp[i-2]);
  }
		  return dp[n];
}

public int minCostClimbingStair3(int[] cost) {
    // Iterate through the cost array in reverse order starting from the third-to-last element.
    for (var i = cost.length-3; i >= 0; i--)
      // Update the cost of the current step by adding the minimum cost of either advancing one or two steps.
      cost[i] += Math.min(cost[i+1], cost[i+2]);

    // Return the minimum cost of reaching the top from either the first or second step.
    return Math.min(cost[0], cost[1]);
  }
}
