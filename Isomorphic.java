
public class Isomorphic {
	  public boolean isIsomorphic(String s, String t) {
	        if(s.length() != t.length())
	            return false;
	            int f1[]=new int[256];
	             int f2[]=new int[256];
	for(int i=0;i<s.length();i++){
	    if(f1[s.charAt(i)]!=f2[t.charAt(i)])return false;
	    f1[s.charAt(i)]=i+1;
	    f2[t.charAt(i)]=i+1;
	}
	return true;
	    }
	}