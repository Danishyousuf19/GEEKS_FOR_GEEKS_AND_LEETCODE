import java.util.ArrayList;

public class path_fromRoot {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	class Solution {
		public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			ArrayList<Integer> cur = new ArrayList<>();
			help(ans, cur, 0, sum, root);
			return ans;
		}

		static void help(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> cur, int cursum, int sum, Node root) {
			if (root == null)
				return;
			cursum += root.data;
			cur.add(root.data);
			if (cursum == sum) {
				ans.add(new ArrayList<>(cur));
			}
			help(ans, cur, cursum, sum, root.left);
			help(ans, cur, cursum, sum, root.right);
			cur.remove(cur.size()-1);
		}
	}
}
