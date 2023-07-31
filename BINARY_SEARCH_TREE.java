
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

	}

	public static void main(String[] args) {
		int nodes[] = { 3, 1, 5, 2, 6 };
		BinarySearchTree b = new BinarySearchTree();
		node root = b.build(nodes);
		System.out.println(root.data);
		System.out.println(b.search(root, 2));
		b.inorder(root);

	}

}
