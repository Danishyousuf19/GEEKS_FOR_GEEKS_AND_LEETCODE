import java.util.HashSet;

public class remove_dublicates_form_linked_list {
	static class Node
	{
	    int data;
	    Node next;
	     Node(int d) {
	        data = d; 
	        next = null;
	    }
	}
	 public static  Node removeDuplicates(Node head) 
	 {
		  HashSet <Integer>set=new HashSet<>();
			 Node curr=head;
			 Node prev=null;
			 while(curr!=null)
			 {
				 int temp =curr.data;
				 if(!set.contains(temp)) {
					 set.add(temp);
					 prev=curr;
				 }
				 else {
					 prev.next=curr.next;
					 
				 }
				 curr=curr.next;
			 }
			 return head;
			 
				 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
