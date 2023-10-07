
public class swap_in_pair {
	class Node {
		int data;
		Node next;

		Node(int key) {
			data = key;
			next = null;
		}
	}

	class Solution {
		// Function to pairwise swap elements of a linked list.
		// It should returns head of the modified list
		public Node pairwiseSwap(Node head) {
			if (head == null || head.next == null)
				return head;
			Node temp=new Node(0);
			temp.next=head;
			Node prev=temp;
			while(head!=null&&head.next!=null) {
				Node second=head.next;
				head.next=second.next;
				second.next=head;
				prev.next=second;
				
				prev=head;
				head=head.next;
			}
			return temp.next;
		}
	}
}
