
public class length_of_last_word {
	 public int lengthOfLastWord(String s) {
			int p = 0;
			for (int i = s.length() - 1; i >= 0;i-- ) {
				if (s.charAt(i) == ' ' && p==0) {
					while(s.charAt(i)==' ') {
						i--;
					}
	                }
	            if(s.charAt(i) == ' ' && p!=0){
	                    return p;
	                }
				 if(Character.isAlphabetic(s.charAt(i))) {
						p++;
					}
				
				
			}
			return p;
		}
}
