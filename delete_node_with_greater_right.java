
public class delete_node_with_greater_right {
	class Node {
		   int data;
		   Node next;

		  Node(int data) {
		      this.data = data;
		  }
		}
	 Node compute(Node head)
	    {
		 if (head == null || head.next == null) {
	            return head; // No nodes or only one node, no removal needed
	        }
		 Node curr=null;
		 Node prev=null;
		 
				 
		 
		 while(head!=null) {
			Node temp=head.next;
			boolean include=true;
				 while(temp!=null) {
					 if(head.data<temp.data) {
						include=false;
						 break;
					 }
					 temp=temp.next;
				 }
				 if(include) {
					 if(curr==null) {
						 curr=head;
					 }
					 if(prev!=null) {
						 prev.next=head;
					 }
					 prev=head;
				 }
				head=head.next;
			 
		 }
		 if(prev!=null) {
			 prev.next=null;
		 }
	       return curr;
	    }
}
