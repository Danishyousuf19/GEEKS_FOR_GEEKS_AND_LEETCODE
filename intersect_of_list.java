
public class intersect_of_list {
	 public class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) {
	         val = x;
		        next = null;
		    }
		}
	 public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
	        ListNode a =h1;
	        ListNode b=h2;
	        while(a!=b) {
	        	a=a==null?h2:a.next;
	        	b=b==null?h1:b.next;
	        }
	        return a;
	    }
}
