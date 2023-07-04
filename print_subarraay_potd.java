
public class print_subarraay_potd {
	 public int countSubArrayProductLessThanK(long a[], int n, long k)
	    {
		 int  c=0;
	       long m=1;
	        int l=0;
	        for(int r=0;r<n;r++) {
	        	m*=a[r];
	        	while(l<=r&&m>=k)
	        	{
	        		m/=a[l];
	        		l++;
	        	}
	        	
	        	c+=(r-l+1);
	        }
	        return c;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
