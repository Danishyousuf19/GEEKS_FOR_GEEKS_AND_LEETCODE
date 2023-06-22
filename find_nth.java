
public class find_nth {
	 long findNth(long N)
	    {
	        long res=0;
	        long  m=1;
	        while(N>0) {
	        	res+=(N%9)*m;
	        	N/=9;
	        	m*=10;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
