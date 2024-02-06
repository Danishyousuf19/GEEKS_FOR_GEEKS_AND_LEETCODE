
public class gcd_of {
	class Solution {
	    public String gcdOfStrings(String str1, String str2) {
	        // Check if concatenated strings are equal or not, if not return ""
	        if (!(str1 + str2).equals(str2 + str1))
	            return "";
	        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
	        int gcd = gcd(str1.length(), str2.length());
	        return str1.substring(0, gcd);
	    }

	    private int gcd(int a, int b) {
	        return b == 0 ? a : gcd(b, a % b);
	    }
	}
	class Solyution {
	    public String gcdOfStrings(String str1, String str2) {
	     int n1=str1.length();
	        int n2=str2.length();
	        if(n1<n2)
	        return gcdOfStrings(str2,str1);
	        if(str1.equals(str2))
	        return str1;
	        if(str1.startsWith(str2))
	        return gcdOfStrings(str1.substring(n2),str2);
	        return "";
	        }
	}
}
