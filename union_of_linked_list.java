import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class union_of_linked_list {


    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }



    public static Node findUnion(Node head1,Node head2)
	{
	    HashSet <Integer>a=new HashSet<>();
	    while(head1!=null) {
	    	a.add(head1.data);
	    	head1=head1.next;
	    }
	    while(head2!=null) {
	    	a.add(head2.data);
	    	head2=head2.next;
	    }
	    ArrayList<Integer>x=new ArrayList<>(a);
	    Collections.sort(x);
	    Collections.reverse(x);
	    Node head=null;
//	    for(int nuedata:x) {
//	    	Node nuenode=new Node(nuedata);
//	    	nuenode.next=head;
//	    	head=nuenode;
//	    }
	    return head;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
