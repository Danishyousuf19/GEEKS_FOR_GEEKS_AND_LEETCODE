
public class path_sm {
//	node class of binary tree
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}
	}

	class Solution {
		class res {
			int ms = Integer.MIN_VALUE;
			int ml = 0;
		}

		public int sumOfLongRootToLeafPath(Node root) {
			res a = new res();
			res b = new res();
			helper(root, 0, 0, a, b);
			return b.ms;
		}

		void helper(path_sm.Node root, int s, int l, res a, res b) {
			if(root==null) {
				if(b.ml<l) {
					b.ml=l;
					a.ms=s;
				}
				else if(b.ml==l&&a.ms<s) {
					a.ms=s;
					return;
				}
			}
			helper(root.left, s+root.data, l+1, a, b);
			helper(root.right, s+root.data, l+1, a, b);
			
		}
	}
}
