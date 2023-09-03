

public class isomorphic_tree {
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}

	boolean isIsomorphic(Node a, Node b) {
		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;
		boolean c1 = a.data == b.data;
		boolean c2 = isIsomorphic(a.left, b.left) && isIsomorphic(a.right, b.right);
		boolean c3 = isIsomorphic(a.left, b.right) && isIsomorphic(a.right, b.left);
		return c1&&(c2||c3);

	}
}
