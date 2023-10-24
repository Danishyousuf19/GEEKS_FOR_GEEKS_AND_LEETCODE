
public class string_partitions {
	static int palindromicPartition(String str)
    {int n=str.length();
        int []dp=new int[n];
        for(int i=0;i<n;i++) {
        	dp[i]=-1;
        	
        }
        return solve(0,n,str,dp)-1;
    }
	static int solve (int i,int n,String s,int[]dp) {
		if(i==n)return 0;
		if(dp[i]!=-1)return dp[i];
		
		int min=Integer.MAX_VALUE;
		for(int k=i;k<n;k++) {
			if(chk(i,k,s)) {
				min=Math.min(min,1+solve(k+1,n,s,dp));
			}
		}
		return dp[i]=min;
	}
	static boolean chk(int i,int j,String s) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
}
