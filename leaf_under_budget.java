import java.util.*;

public class leaf_under_budget {
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}

	public int getCount(Node node, int k) {
		if (node == null)
			return 0;
		int ans = 0;
		Queue<Node> q = new LinkedList<>();
		q.offer(node);
		int l = 0;
		while (!q.isEmpty() && k > 0) {
			l++;
			int n = q.size();
			for (int i = 0; i < n; i++) {
				Node curr = q.poll();
				if (curr.left == null && curr.right == null) {
					if (k - l >= 0) {
						ans += 1;
						k -= l;
					} else {
						return ans;
					}

				}
				if (curr.left != null) {
					q.add(curr.left);
				}

				if (curr.right != null) {
					q.add(curr.right);
				}
			}

		}
		return ans;
	}
}
