
public class count_no_of_hops {
	static long countWays1(int n)
    {
        if(n==1||n==0)return 1;
        if(n==2) return 2;
        if(n==3)return 4;
	        return countWays1(n-1)+countWays1(n-2)+countWays1(n-3);
        // add your code here
    }
	
	 static long countWays(int n)
    {if(n==1)return 1;
    if(n==2)return 2;
    if(n==0)return 1;
    if(n==3 )return 4;
		long dp[]=new long [n+1];
		dp[0]=dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4;i<=n;i++) {
			dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
		}
		return dp[n];
    }
}
