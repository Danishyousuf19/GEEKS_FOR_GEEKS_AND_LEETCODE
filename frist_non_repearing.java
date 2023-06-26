
public class frist_non_repearing {
	 static char nonrepeatingCharacter(String S)
	    {
	        for(int i=0;i<S.length();i++) {
	        	char c=S.charAt(i);
	        	if(S.indexOf(c)==S.lastIndexOf(c)){
	        		return c;
	        	}
	        }
	        return '$';
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
