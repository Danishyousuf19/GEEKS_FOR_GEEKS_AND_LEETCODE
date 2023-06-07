
public class nth_term {
	 public int NthTerm(int n)
	    {int m=1000000007;
	    long nth=1;
	        for(int i=0;i<=n;i++) {
	        	
	        	nth=(nth*i+1)%m;
	        	
	        }
			return (int) nth;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
