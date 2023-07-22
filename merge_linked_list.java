
public class merge_linked_list {
	
	 
	  static   class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	    }
	

	static class LinkedList
	{
	    //Function to merge two sorted linked list.
	    static Node sortedMerge(Node head1, Node head2) {
	     

	    	Node nue=new Node(0);
	    	Node curr=nue;
	    	while(head1!=null&&head2!=null) {
	    		if(head1.data<=head2.data) {
	    			curr.next=head1;
	    			head1=head2.next;
	    		}
	    		else {
	    			curr.next=head2;
	    			head2=head2.next;
	    		}
	    		curr=curr.next;
	    
	    	
	    	}
	    	curr.next=head1!=null?head1:head2;	
	    	return nue.next;
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

