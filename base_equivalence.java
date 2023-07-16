
public class base_equivalence {
	  String baseEquiv(int n, int m)
	    {
	        int i=0;
	        while(i<=32) {
	        	int digit=(int)(Math.log(n)/Math.log(i));
	        	if(digit==m) {
	        		
	        		return "YES";
	        	}
	        	i++;
	        }
	        return "NO";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
