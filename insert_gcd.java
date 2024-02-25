
public class insert_gcd {
	class Solution {
	    private int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	    
	    public ListNode insertGreatestCommonDivisors(ListNode head) {
	        ListNode curNode = head;
	        while(curNode.next != null) {
	            int gcd = gcd(curNode.val, curNode.next.val);
	            ListNode node = new ListNode(gcd);
	            node.next = curNode.next;
	            curNode.next = node;
	            curNode = curNode.next.next;
	        }
	        return head;
	    }
	}
}
