
public class alternsting_bits {
	 public boolean hasAlternatingBits(int n) {
	       
	        while(n>0){
	int r=n&1;
	n>>=1;
	int o=n&1;
	if(n==r)return false;
	        }
	        return true;
	    }
}
