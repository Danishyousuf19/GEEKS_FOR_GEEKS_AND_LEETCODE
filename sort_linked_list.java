
public class sort_linked_list {
	class Node
	{
	    int data;
	    Node next;
	    Node(int data)
	    {
	        this.data = data;
	        next = null;
	    }
	}
	 static Node segregate(Node head)
	    {
		 int a=0,b=0,c=0;
		 Node temp=head;
		 while(temp!=null) {
			 if(temp.data==0)
				 a++;
			 else if(temp.data==1)
				 b++;
			 else 
				 c++;
			 temp=temp.next;
		 }
		 temp=head;
		 
			 while(temp!=null)
			 {
				 if(a>0)
				{	 temp.data=0;
					 a--;}
				 else if(b>0)
				{	 temp.data=1;
					 b--;}
				 else
				{	 temp.data=2;
					 c--;}
				 temp=temp.next;
			 }
	        return head;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
