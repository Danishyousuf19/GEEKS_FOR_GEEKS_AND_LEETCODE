
public class xor_of_all_pairs {
	  public long sumXOR (int arr[], int n) {
	        //Complete the function
		  long a=0;
		  for(int i=0;i<32;i++) {
			  int c1=0;
			  int c0=0;
			  int bitmask=1<<i;
			  for(int j=0;j<n;j++) {
				  if((arr[j]&bitmask)==0)c0++;
				  else c1++;
			  }
			  a+=c1*c0*bitmask;
		  }
		  return a;
	    }
}
