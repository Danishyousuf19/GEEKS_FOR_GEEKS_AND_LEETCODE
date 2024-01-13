
public class is_sub {
	  public boolean isSubsequence(String s, String t) {
	        if (s.length() == 0){
	            return true;
	        }
	        if (t.length() == 0){
	            return false;
	        }
	        for (int i=0, j=0; j<t.length(); j++){
	            if (s.charAt(i) == t.charAt(j)){
	                i++;
	                if (i == s.length()) return true;
	            }
	        }
	        return false;

	    }  
}
