
public class rotate_string {
public boolean rotateString(String str, String g) {
	if(str.length()!=g.length()) return false;
	int n=str.length();
	StringBuilder s=new StringBuilder(str);
	while(n>0) {
		if(s.toString().equals(g)) return true;
		char c=s.charAt(0);
		s.deleteCharAt(0);
		s.append(c);
		n--;
	}
        return false;
    }
}
