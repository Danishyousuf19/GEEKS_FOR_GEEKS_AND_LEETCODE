import java.util.HashSet;

public class fond_str {
	class Solution {

	    public void dfs(int k, String prev, HashSet<String> set, StringBuilder ans) {

	        for (int i = 0; i < k; i++) {

	            String curr = prev + i;

	            

	            if (!set.contains(curr)) {

	                set.add(curr);

	                dfs(k, curr.substring(1), set, ans);

	                ans.append(i);

	            }

	        }

	    }

	    public String findString(int n, int k) {

	        String s = "0".repeat(n - 1);

	        StringBuilder ans = new StringBuilder();

	        HashSet<String> set = new HashSet<>();

	        dfs(k, s, set, ans);

	        ans.append(s);

	        return ans.toString();

	    }

	}


}
