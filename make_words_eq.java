
public class make_words_eq {
	public boolean makeEqual(String[] w) {
        int n=w.length;
        if(n==1)return true;
        int sum=0;
        for(String s:w){
            sum+=s.length();
        }
        if(sum%n!=0)return false;
        int dp[]=new int[26];
        for(String s:w){
            for(char c:s.toCharArray()){
                dp[c-'a']++;
            }
        }
        for(int i :dp){
            if(i%n!=0)return false;
        }
        return true;
    }
}
