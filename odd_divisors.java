
public class odd_divisors {
	 static int oddNumberOfDivisor(int N){
	       int c=0;
	       for(int i=1;i<=N;i++) {
	    	   int divisor=0;
	    	   for(int j=1;j<=Math.sqrt(i);j++) {
	    	   if(i%j==0) {
	    		   
	    		  divisor++;
	    		  if (i / j != j) {
	                    divisor++;
	                }
	    		   }
	    	  
	    	   }
	    	  if(divisor % 2 == 1) {
	    		  c++;
	    	  }
	       }
	       return c;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=	oddNumberOfDivisor(89384);System.out.println(x);
	}

}
