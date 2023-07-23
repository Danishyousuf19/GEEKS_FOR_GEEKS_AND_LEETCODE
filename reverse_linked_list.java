import java.util.LinkedList;

public class reverse_linked_list {
	static class Node {
	    int data;
	    Node next;
	    Node(int value) {
	        this.data = value;
	    }
	}
//	using while loop
	static  Node reverseList(Node head)
	    {
		 Node prev=null;
		 Node curr=head;
		 Node nxt=null;
		 while(curr!=null) {
			 nxt=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=nxt;
		 }
		 return prev;

				 
	        // code here
	    }
	static Node rec(Node head)
	{
		if(head==null||head.next==null)
			return head;
		Node nue=rec(head.next);
		head.next.next=head;
		head.next=null;
		return nue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
