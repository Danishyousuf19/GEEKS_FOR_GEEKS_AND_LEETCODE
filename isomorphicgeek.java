
public class isomorphicgeek {
	public static boolean areIsomorphic(String s1, String s2) {
	    if (s1.length() != s2.length()) return false;

	    int[] a = new int[256];  // Assuming ASCII characters
	    int[] b = new int[256];

	    for (int i = 0; i < s1.length(); i++) {
	        if (a[s1.charAt(i)] != 0 && a[s1.charAt(i)] != s2.charAt(i)) {
	            return false;
	        }
	        if (b[s2.charAt(i)] != 0 && b[s2.charAt(i)] != s1.charAt(i)) {
	            return false;
	        }
	        a[s1.charAt(i)] = s2.charAt(i);
	        b[s2.charAt(i)] = s1.charAt(i);
	    }

	    return true;
	}

}
