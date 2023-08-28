
public class remove_b_ac {
	public String stringFilter(String s) {
	    char[] chars = s.toCharArray();
	    int writeIndex = 0; // Points to the index where the next character should be written

	    for (int readIndex = 0; readIndex < chars.length; readIndex++) {
	        if (chars[readIndex] == 'b') {
	            // Skip 'b' character
	        } else if (readIndex < chars.length - 1 && chars[readIndex] == 'a' && chars[readIndex + 1] == 'c') {
	            readIndex++; // Skip 'a' and 'c' characters
	        } else {
	            chars[writeIndex] = chars[readIndex];
	            writeIndex++;
	        }
	    }

	    return new String(chars, 0, writeIndex); // Convert the modified portion of the array back to a string
	}
}
