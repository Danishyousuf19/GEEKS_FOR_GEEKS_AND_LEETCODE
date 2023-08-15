
public class likedListpartition {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
public ListNode partition(ListNode head, int x) {
	ListNode lessthan =new ListNode(0);
	ListNode greaterthan =new ListNode(0);
	ListNode less_curr=lessthan;
	ListNode greater_curr=greaterthan;
	while(head!=null) {
		if(head.val<x) {
			less_curr.next=head;
			less_curr=less_curr.next;
		}
		else {
			greater_curr.next=head;
			greater_curr=greater_curr.next;
		}
		head=head.next;
	}
	greater_curr.next=null;
	less_curr.next=greaterthan.next;
	return lessthan.next;
    }
	
	
        
    }

