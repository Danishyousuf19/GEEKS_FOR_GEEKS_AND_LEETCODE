import java.util.*;

public class pattern_bfs {
//	Node is as follows:
	class Node {
		int data;
		Node left, right;

		Node(int d) {
			data = d;
			left = right = null;
		}
	}

	class Tree {
		public static ArrayList<Integer> diagonalSum(Node root) {
			// code here.
			ArrayList<Integer> ans = new ArrayList<>();
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
			int s=q.size();
			int cs=0;
			for(int i=0;i<s;i++) {
				Node c=q.poll();
				while(c!=null) {
					if(c.left!=null)q.add(c.left);
					cs+=c.data;
					c=c.right;
				}
			}
			ans.add(cs);
			}
			return ans;

		}
	}
}
