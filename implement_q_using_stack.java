import java.util.Stack;

public class implement_q_using_stack {
	class MyStack {
		private final Stack<Integer> s1 = new Stack<>();

		public MyStack() {

		}

		public void push(int x) {
			Stack<Integer> s2 = new Stack<>();
			while (!this.s1.isEmpty()) {
				s2.push(s1.pop());
			}
			this.s1.push(x);

			while (!s2.isEmpty()) {
				this.s1.push(s2.pop());
			}
		}

		public int pop() {
			return s1.pop();
		}

		public int top() {
			return s1.peek();
		}

		public boolean empty() {
			return s1.isEmpty();

		}
	}
}
