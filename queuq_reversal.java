import java.util.*;

public class queuq_reversal {
	 public Queue<Integer> rev(Queue<Integer> q){
		 Stack<Integer>s=new Stack<>();
		 while(!q.isEmpty()) {
			 s.push(q.remove());
		 }
		 while(!s.isEmpty()) {
			 q.add(s.pop());
		 }
		return q;
	      
	    }
}
