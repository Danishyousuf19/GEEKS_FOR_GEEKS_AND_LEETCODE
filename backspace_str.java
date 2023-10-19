
public class backspace_str {
	 public boolean backspaceCompare(String s, String t) {
		 StringBuilder s1=new StringBuilder();
		 s1.append(s.charAt(0));
		 StringBuilder t1=new StringBuilder();
		 t1.append(s.charAt(0));
		 for(int i=1;i<s.length();i++) {
			 if(s.charAt(i)!='#')s1.append(s.charAt(i));
			 else s1.deleteCharAt(i-1);
		 }
		 for(int i=1;i<t.length();i++) {
			 if(t.charAt(i)!='#')t1.append(t.charAt(i));
			 else t1.deleteCharAt(i-1);
		 }
		 return s1.toString().equals(t1.toString());
	    }
}
class Soluti99on6 {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int sBackspaceCount = 0;
        int tBackspaceCount = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0 && (s.charAt(i) == '#' || sBackspaceCount > 0)) {
                if (s.charAt(i) == '#') {
                    sBackspaceCount++;
                } else {
                    sBackspaceCount--;
                }
                i--;
            }

            while (j >= 0 && (t.charAt(j) == '#' || tBackspaceCount > 0)) {
                if (t.charAt(j) == '#') {
                    tBackspaceCount++;
                } else {
                    tBackspaceCount--;
                }
                j--;
            }

            if (i < 0 && j < 0) {
                return true;
            }

            if (i < 0 || j < 0 || s.charAt(i) != t.charAt(j)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }
}

