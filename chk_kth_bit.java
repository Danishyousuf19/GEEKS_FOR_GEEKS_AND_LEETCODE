
public class chk_kth_bit {
	  static boolean checkKthBit(int n, int k)
	    {
	        // Your code here
	        return (n&(1<<k))==(1<<k);
	    }
}
