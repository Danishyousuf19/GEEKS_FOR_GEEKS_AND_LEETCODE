
public class invert_star {
	 static String[] invIsoTriangle(int N) {
	       String s[]=new String[N];
	       for(int i=0;i<N;i++) {
	    	   String n="";
	    	   for(int k=0;k<i;k++) {
	    		   n=n+" ";
	    	   }
	    	   for(int j=i;j<N;j++) {
	    		   n=n+"*";
	    	   }
	    	   s[i]=n;
	       }
	       return s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
