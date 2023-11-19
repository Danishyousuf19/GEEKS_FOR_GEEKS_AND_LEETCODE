
public class inteersection_of_ll{
	class rer{
	static  class Node {
		   int data;
		    Node next;
		    Node(int d)  { data = d;  next = null; }
		}

	   public static Node findIntersection(Node head1, Node head2)
	    {
	        Node head = null;
	        Node prev = head;
	   
	        while(head1 != null && head2 != null){
	            
	            if(head1.data < head2.data) head1 = head1.next;
	            else if(head2.data < head1.data) head2 = head2.next;
	            else if(head1.data == head2.data) {
	                Node cur = new Node(head1.data);
	                
	                if(head == null) head =prev= cur;
	                else {
	                    prev.next = cur;
	                    prev = cur;
	                }
	                head1 = head1.next;
	                head2 = head2.next;
	                
	            }
	        }
	        return head;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			

	}

}
