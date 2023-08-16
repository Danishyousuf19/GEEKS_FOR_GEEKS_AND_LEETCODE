
public class catalan_no {
	 public static int findCatalan1(int n) {
	        if(n==0)return 1;
	         long dp[]=new long [n+1];
		     dp[0]=dp[1]=1;
		     for(int i=2;i<=n;i++) {
		    	 for(int j=0;j<i;j++) {
		    		 dp[i]=(dp[i]+(dp[j]*dp[i-j-1])%1000000007)%1000000007;//Cn=C0*Cn-1+C1*Cn-2...Cn-1*C0
		    	 }
		     }
		     return (int) dp[n];
	    }

}
