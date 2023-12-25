
public class decode_str {
	 public int numDecodings(String s) {
	        int n=s.length();
	        if(n==0)return 0;
	        int dp[]=new int [n+1];
	        dp[n]=1;
	        for(int i=n-1;i>=0;i--){
	            if(s.charAt(i)=='0')dp[i]=0;
	            else{
	                dp[i]+=dp[i+1];
	                if(i+1<n&&Integer.parseInt(s.substring(i,i+2))<=26)
	                dp[i]+=dp[i+2];
	            }
	        }
	        return dp[0];
	    }
	 public int numDecodihngs(String s) {
	        int[] dp = new int[s.length() + 1];
	        dp[0] = 1; // empty string
	        dp[1] = s.charAt(0) == '0' ? 0 : 1;
	        for (int i = 2; i < s.length() + 1; i++) {
	            if (s.charAt(i - 1) != '0') {
	                dp[i] += dp[i - 1];
	            }
	            if (
	                s.charAt(i - 2) == '1' ||
	                (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7')
	            ) {
	                dp[i] += dp[i - 2];
	            }
	        }
	        return dp[s.length()];
	    }
}
