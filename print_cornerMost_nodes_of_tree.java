import java.util.*;

public class print_cornerMost_nodes_of_tree {
	class Node {
		int data;
		Node left, right;

		Node(int key) {
			data = key;
			left = right = null;
		}
	}

	class Tree {
		public static void printCorner(Node node) {

			if (node == null) {
				System.out.println(0);
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.offer(node);
			while (!q.isEmpty()) {
				int n=q.size();
				for(int i=0;i<n;i++) {
					Node curr=q.poll();
					if(i==0||i==n-1)
						System.out.println(curr.data+" ");
					if(curr.left!=null) q.offer(curr.left);
					if(curr.right!=null) q.offer(curr.right);
				}

			}
		}

	}
}
