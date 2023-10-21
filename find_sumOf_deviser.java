
public class find_sumOf_deviser {
	  static long sumOfDivisors(int N){
	        // code here
		  long a=0;
		  for(int i=1;i<=N;i++) {
			  a+=i*(N/i);
		  }
		  return a;
	    }
}
