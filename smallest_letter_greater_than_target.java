
public class smallest_letter_greater_than_target {
	 public char nextGreatestLetter(char[] letters, char target) {
	        int s=0,e=letters.length-1;
	        int mid;
	        while(s<=e) {
	        	mid=s+(e-s)/2;
	        	if(target<letters[mid]) {
	        		e=mid-1;
	        	}
	        	else {
	        		s=mid+1;
	        	}
	        }
	        return letters[s%letters.length];
	        		
	        		
	    }
}
