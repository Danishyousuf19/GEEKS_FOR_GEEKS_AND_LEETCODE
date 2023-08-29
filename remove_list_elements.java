

public class remove_list_elements {
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }}
	    public ListNode removeElements(ListNode head, int val) {
	        if (head == null)
	            return head;

	        ListNode curr = null;
	        ListNode prev = null;

	        while (head != null) {
	            if (head.val == val) {
	                head = head.next;
	                continue;
	            }

	            if (curr == null) {
	                curr = head;
	            }

	            if (prev != null) {
	                prev.next = head;
	            }

	            prev = head;
	            head = head.next;
	        }

	        if (prev != null) {
	            prev.next = null; // Handle the last node
	        }

	        return curr;
	    }}