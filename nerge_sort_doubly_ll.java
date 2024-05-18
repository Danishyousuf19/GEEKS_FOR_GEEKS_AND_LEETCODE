
public class nerge_sort_doubly_ll {
	class Node
	{
	    int data;
	    Node next, prev;
	    Node(int data)
	    {
	        this.data = data;
	        next = prev = null;
	    }
	}
	
	class Solution {
	    // Function to sort the given doubly linked list using Merge Sort.
	    static Node sortDoubly(Node head) {
	        // add your code here
	    	if(head==null||head.next==null) 
return head;
	    	
	    	Node sec=split(head);
	    	head=sortDoubly(head);
	    	sec=sortDoubly(sec);
	    	return merge(head,sec);
	    	
	    }
	    static Node split(Node a) {
	    	Node f=a,s=a;
	    	while(f.next!=null&&f.next.next!=null) {
	    		f=f.next.next;
	    		s=s.next;
	    	}
	    	Node t=s.next;
	    	s.next=null;
	    	return t;
	    }
	    
	    static Node merge(Node a,Node b) {
	    	if(a==null)return b;
	    	if(b==null)return a;
	    	if(a.data>b.data) {
	    		a.next=merge(a.next,b);
	    		a.next.prev=a;
	    		a.prev=null;
	    		return a;
	    	}
	    	else {
	    		b.next=merge(a,b.next);
	    		b.next.prev=b;
	    		b.prev=null;
	    		return b;
	    	}
	    }
	}
}
