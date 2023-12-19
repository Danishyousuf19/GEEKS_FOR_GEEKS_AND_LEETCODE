
public class pos_of_right_modt_bit {
	  public static int posOfRightMostDiffBit(int m, int n)
	    {
	            
	        // Your code here    
	       int i = 1;
	    
	    if (n == m) return -1;

	    while (n != 0 || m != 0) {
	        if ((m & 1) != (n & 1)) {
	            return i;
	        }
	        m >>= 1;
	        n >>= 1;
	        i++;
	    }

	    return -1;
	}
}
