
public class reverse_wordds_oF_str {
	 public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        
        return result.toString().trim();
    } 
	 public String reverse(String s) {
	        char[] chars = s.toCharArray();
	        int start = 0;
	        
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] == ' ' || i == chars.length - 1) {
	                int end = (i == chars.length - 1 && chars[i] != ' ') ? i + 1 : i;
	                while (start < end) {
	                    char temp = chars[start];
	                    chars[start] = chars[end - 1];
	                    chars[end - 1] = temp;
	                    start++;
	                    end--;
	                }
	                start = i + 1;
	            }
	        }
	        
	        return new String(chars);
	    }
	}
