
public class semi_prime {
	static boolean chk(int n) {
		
			if(n==2|n==3|n==5) {
				return true;
			}
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)return false;
			}
			return true;
		
	}
	static  int checkSemiprime(int N) {
	      for(int i=2;i<=N/2;i++) {
	    	  if(chk(i)) {
	    		  int b=N/i;
	    		  if(chk(b)&(i*b==N))
	    		  {
	    		  return 1;
	    	  }
	    	  }
	      }
		return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkSemiprime(8));
	}

}
