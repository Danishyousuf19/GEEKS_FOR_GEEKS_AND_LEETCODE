
public class delete_nth_node {
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	  Node deleteNode(Node head, int x)
	    {
		  if(x==1)return head.next;
		  int c=2;
		  Node curr=head.next;
		  Node prev=head;
		  while(c<x&&curr!=null) {
			  prev=curr;
			  curr=curr.next;
			  c++;
		  }
		 if(curr!=null) {
			 prev.next=curr.next;
		 }
				  
		return head;
	    }
}
