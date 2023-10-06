
public class reverse_ll_alter {
	class Node
	{
	    int data;
	    Node next;
	    Node(int key)
	    {
	        data = key;
	        next = null;
	    }}
    public static void rearrange(Node odd)
    {int c=0;
        Node cur=odd;
        while(cur.next!=null) {
        	c++;
        	cur=cur.next;
        }
        Node prev=null;
        Node curr=odd;
        Node nxt=curr.next;
        while(curr.next!=null||nxt.next!=null) {
        	curr.next=nxt.next;
        	curr=nxt.next;
        	nxt.next=prev;
        	prev=nxt.next;
        	nxt=curr.next;
        	
        }
        if(c%2==0) {
        	nxt.next=prev;
        	
        }
        else {
        	curr.next=prev;
        }
    }
}
