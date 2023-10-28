
public class unique_dig {
	  public int countNumbersWithUniaqueDigits(int n) {
	        int dp[]=new int[9];
	        dp[0]=1;
	        dp[1]=10;
	        dp[2]=91;
	        
	        for(int i=3;i<9;i++){
	            int a=9;
	        int c=9;
	        for(int j=1;j<i;j++){
	            a*=c;
	            c--;
	        }
	        dp[i]=dp[i-1]+a;
	        }
	        return dp[n];
	    }
	  public int countNumbersWithUniqueDigits(int n) {
	        if(n==0)
	        return 1;
	        int p=9,q=9,r=n;
	        while(n-->1)
	        p*=q--;     
	        return p+countNumbersWithUniqueDigits(r-1);
	    }
}
