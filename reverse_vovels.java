
public class reverse_vovels {
	 public String reverseVowels(String s) {
	        char[] word=s.toCharArray();
	        int l=0;
	        int e=word.length-1;
	        String vovels="aeiouAEIOU";
	        while(l<e) {
	        	if(l<e&&vovels.indexOf(word[l])==-1) {
	        		l++;
	        	}
	        	if(l<e&&vovels.indexOf(word[e])==-1) {
	        		e--;
	        	}
	        	char t=word[l];
	        	word[l]=word[e];
	        	word[e]=t;
	        	l++;
	        	e--;
	        }
	        return new String(word);
	    }
}
