
public class delete_nth_from_last {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode temp = head;
			int k = 1;
			while (temp.next != null) {
				k++;
				temp = temp.next;
			}
			int p = k - n + 1;
			ListNode curr = head;
			ListNode prev = null;
			for (int i = 1; i < p; i++) {
				prev = curr;
				curr = curr.next;
			}
			if (prev == null)
				return head = head.next;
			else {
				prev.next = curr.next;
				return head;
			}

		}
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    if(head == null) return head;
	    int k = 0;
	    ListNode curr = head;
	    for(; curr != null; curr = curr.next) k++;
	    k -= n; //to get position of given element from first node
	    if(k == 0) return head.next;
	    for(curr = head; k > 1; k--, curr = curr.next) ;
	    curr.next = curr.next.next; // to remove that node
	    return head;}
}
