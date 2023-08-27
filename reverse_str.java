
public class reverse_str {
	public static String reverseWord(String str) {
	    char[] charArray = str.toCharArray();
	    
	    for (int i = 0; i < charArray.length / 2; ++i) {
	        swap(charArray, i, charArray.length - i - 1);
	    }
	    
	    return new String(charArray);
	}

	static void swap(char[] arr, int idx1, int idx2) {
	    char temp = arr[idx1];
	    arr[idx1] = arr[idx2];
	    arr[idx2] = temp;
	}

}
