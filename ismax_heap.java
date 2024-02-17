
public class ismax_heap {
	 public boolean countSub(long arr[], long n)
	    {
	     
	    // Start from the last parent and move up to the root
	    for (int i = (int)(n / 2) - 1; i >= 0; i--) {
	        // Check if left child exists and if it's greater than parent
	        if (2 * i + 1 < n && arr[i] < arr[2 * i + 1])
	            return false;

	        // Check if right child exists and if it's greater than parent
	        if (2 * i + 2 < n && arr[i] < arr[2 * i + 2])
	            return false;
	    }
	    return true;


	    }
}
