
public class panaram {
	static boolean panagram(String s) {
	 boolean v[] = new boolean[26];
	    s = s.toLowerCase();
	    for(int i = 0; i < s.length(); i++){
	        char c = s.charAt(i);
	        if(c >= 'a' && c <= 'z'){
	            v[c - 'a'] = true;
	        }
	    }
	    
	    for(int i = 0; i < 26; i++){
	        if(!v[i]) return false;
	    }
	    return true;
}
}