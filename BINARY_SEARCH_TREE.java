
public class BINARY_SEARCH_TREE {

	static class node {
		int data;
		node left;
		node right;

		node(int d) {
			data = d;
			this.left = null;
			this.right = null;
		}
	}

	static class BinarySearchTree {
		static node insert(node root, int data) {
			if (root == null) {
				return new node(data);
			}
			if (root.data > data) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
			return root;

		}

		static node build(int nodes[]) {
			node root = null;
			for (int i = 0; i < nodes.length; i++) {
				root = insert(root, nodes[i]);
			}
			return root;
		}

		boolean search(node root, int x) {
			if (root == null)
				return false;
			if (root.data == x)
				return true;
			if (root.data < x)
				return search(root.right, x);
			else
				return search(root.left, x);
		}

		void inorder(node root) {
			if (root == null)
				return;
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}

		static node delete(node root, int d) {
			if (root.data > d) {
				root.left = delete(root.left, d);
			} else if (root.data < d) {
				root.right = delete(root.right, d);
			}
			// if ==
			else {
//				CASE 1
				if (root.left == null && root.right == null)
					return null;
//				case 2
				if (root.left == null)
					return root.right;
				else if (root.right == null)
					return root.left;
//				case 3
				node IS = InorderSuccessor(root.right);
				root.data = IS.data;
				root.right = delete(root.right, IS.data);
			}
			return root;
		}

		static node InorderSuccessor(node root) {
			while (root.left != null) {
				root = root.left;
			}
			return root;
		}

		static void printInRange(node root, int x, int y) {
			if (root == null)
				return;
			if (root.data >= x && root.data <= y) {
				printInRange(root.left, x, y);
				System.out.print(root.data + " ");
				printInRange(root.right, x, y);
			} else if (root.data >= y) {
				printInRange(root.left, x, y);
			} else {
				printInRange(root.right, x, y);
			}
		}

	}

	public static void main(String[] args) {
		int nodes[] = { 3, 1, 5, 2, 6 };
		BinarySearchTree b = new BinarySearchTree();
		node root = b.build(nodes);
		System.out.println(root.data);
		System.out.println(b.search(root, 2));
		b.inorder(root);
		System.out.println("before deleting node");
		b.delete(root, 3);
		System.out.println("after deleting node");
		b.inorder(root);
		System.out.println("print in range");
		b.printInRange(root, 3, 6);

	}

}
