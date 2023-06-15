
public class nine_divisors {
	static boolean chk(int n) {
		int nine=0;
		for(int i=1;i<=n/2;i++)
			{if(n%i==0) {
				nine++;
			}
	
			}
		if(nine!=9) {
			return false;
		}
		return true;
	}
	 static long nineDivisors(long N){
	      long c=0;
	      for(int i=36;i<=N;i++) {
	    	  chk(i);
	      }
	       return c;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
