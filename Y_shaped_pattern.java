
public class Y_shaped_pattern {
	 static String[] yShapedPattern(int N) {
	        String s[]=new String[N];
	        for(int i=0;i<N;i++) {
	        	String n="";
	        	for(int j=0;j<N;j++) {
	        		if(j==i|j==N-i) {
	        			n=n+"*";
	        			
	        		}
	        		else {
	        			n=n+" ";
	        		}
	        	}
	        	s[i]=n;
	        }
	        return s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
