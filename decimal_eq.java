
public class decimal_eq {
	 static final int MOD = 1000000007;
	    class Node{
	    	Node next;
	    	int data;
	    }
	    long DecimalValue(Node head)
	    {
	        long ans = 0;
	        while (head != null) {
	            ans = ((ans << 1) + head.data) % MOD;
	            head = head.next;
	        }
	        return ans;
	    }
}
