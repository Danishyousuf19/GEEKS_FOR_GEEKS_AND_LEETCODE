
public class reverse_int {
	 public int reverse(int x) {
	      int ans=0;
	        boolean neg=false;
	        if(x<0) {
	        	neg=true;
	        	x=-x;
	        }
	        while(x>0) {
	        	int rem=x%10;
	        	 if(ans>(Integer.MAX_VALUE-rem)/10)return -1;
	        	ans=ans*10+rem;
	        	x/=10;
	        }
	       
	        
	        return neg?-ans :ans;
	    }
}
