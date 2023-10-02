import java.util.HashMap;

public class no_of_sub_sequences {
	int distinctSubsequences(String S) {
		int n = S.length();
		int dp[] = new int[n + 1];
		dp[0]=1;
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=1;i<n;i++) {
			char c=S.charAt(i);
			dp[i]=(2*dp[i-1])%1000000007;
			if(map.containsKey(c)) {
				int pi=map.get(c);
				dp[i]=(dp[i]-dp[i-pi]+1000000007)%1000000007;
			}
		map.put(c, i);
		}
		return dp[n];

	}
}
