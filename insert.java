
public class insert {
	class Node{
		Node next;
		int data;
		Node(int f){
			
		}
	}
	  public Node sortedInsert(Node head, int data) {
	        // code here
	        Node curr = head;
	        Node new_node = new Node(data);
	        if(curr== null){
	            new_node.next = new_node;
	            return new_node;
	        }
	        else if(curr.data>=data){
	            while(curr.next!=head){
	                curr= curr.next;
	            }
	            curr.next= new_node;
	            new_node.next = head;
	            return new_node;
	        }
	        else{
	            while(curr.next!=head && curr.next.data<data)
	            curr=curr.next;
	            new_node.next = curr.next;
	            curr.next = new_node;
	            return head;
	        }
	    }
}
