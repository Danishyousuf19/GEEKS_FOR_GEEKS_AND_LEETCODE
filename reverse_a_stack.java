import java.util.*;

public class reverse_a_stack {
	
	 static void reverse(Stack<Integer> s)
	    {
	       Queue<Integer>l=new LinkedList<>();
	       while(!s.isEmpty()) {
	    	   l.add(s.pop());
	       }
	       while(!l.isEmpty()) {
	    	   s.add(l.poll());
	       }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
