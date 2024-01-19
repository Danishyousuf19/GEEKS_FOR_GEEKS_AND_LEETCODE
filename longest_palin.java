
public class longest_palin {
	 public int longestPalindrome(String s) {
	        int[] letters = new int[128];
	        for (char c : s.toCharArray()) {
	            letters[c - 'A']++;
	        }
	        int even = 0;
	        boolean hasOdd = false;
	        for (int i = 0; i < 128; i++) {
	            if (letters[i] % 2 == 0) {
	                even += letters[i];
	            } else {
	                even += letters[i] - 1;
	                hasOdd = true;
	            }
	        }
	        if (hasOdd) even += 1;
	        return even;
	    }
}
