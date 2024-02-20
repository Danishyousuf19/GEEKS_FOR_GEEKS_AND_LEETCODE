import java.util.ArrayList;
import java.util.HashSet;

public class word_break {
	class Solution
	{
	    public static int wordBreak(String A, ArrayList<String> B )
	    {
	        //code here
	        /*
	        just dfs until we can get to the end, and try all substrings
	        */
	        HashSet<String> seen = new HashSet<>();
	        for (String w : B){
	            seen.add(w);
	        }
	        
	        if (rec(0,A,seen))
	            return 1;
	        return 0;
	    }
	    public static boolean rec(int i, String A, HashSet<String> seen){
	        if (i >= A.length())
	            return true;
	        
	        for (int j = i + 1; j <= A.length(); j++){
	            String temp = A.substring(i,j);
	            if (seen.contains(temp) && rec(j,A,seen) == true)
	                return true;
	        }
	        
	        return false;
	    }
	}
}
