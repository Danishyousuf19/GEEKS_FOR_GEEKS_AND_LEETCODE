
public class Last_index_0fOne {

	 public int lastIndex( String s) {
	        for (int i=s.length()-1;i>=0;i--) {
	        	char c=s.charAt(i);
	        	if(c=='1') {
	        		return i;
	        	}
	        }return -1;
	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
