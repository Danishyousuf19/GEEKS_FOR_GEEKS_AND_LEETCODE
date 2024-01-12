import java.util.Queue;
import java.util.Stack;

public class reverse_quueue {
	 public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
	        if (q.isEmpty() || k == 0) {
	            return q; // Handle empty queue or k = 0 cases
	        }

	        Stack<Integer> stack = new Stack<>();

	        // Reverse first k elements using a stack
	        for (int i = 0; i < k; i++) {
	            stack.push(q.remove());
	        }

	        // Enqueue elements from stack back to queue
	        while (!stack.isEmpty()) {
	            q.add(stack.pop());
	        }

	        // Move remaining elements to the back of the queue
	        for (int i = 0; i < q.size() - k; i++) {
	            q.add(q.remove());
	        }

	        return q;
	    }
	}
}
