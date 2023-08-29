

public class list_cycle_length {
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	int len(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null&&fast!=null) {
			if(slow==fast) {
				ListNode temp=slow;
				int l=0;
				do {
					l++;
					temp=temp.next;
				}
				while(temp!=fast);
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return -1;
	}
}
