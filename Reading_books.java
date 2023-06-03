
public class Reading_books {
	 static long maxPoint(int N, long K, long A[], long B[])
	    {
	       long max=0;
	       for(int i=0;i<N;i++) {
	    	   long time=K/A[i];
	    	   long total=time*B[i];
	    	   if(total>max) {
	    		   max=total;
	    	   }
	       }return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
