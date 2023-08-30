
public class hapy_number {
	 public boolean isHappy(int n) {
	        int slow=n;
	        int fast=n;
	        do {
	        	slow=square(slow);
	        	fast=square(square(fast));
	        }
	        while(slow!=fast);
	        return slow==1;
	    }

	public static int square(int x) {
		int sq=0;
		while(x>0) {
			int rem=x%10;
			sq+=(rem*rem);
			x/=10;
		}
		return sq;
		
	}
	 
}
