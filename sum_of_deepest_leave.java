
public class sum_of_deepest_leave {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int MaxLevel = 0;
		int sum = 0;

		public int deepestLeavesSum(TreeNode root) {
			if (root == null)
				return 0;
			dfs(root, 0);
			return sum;
		}

		void dfs(TreeNode root, int level) {
			if (root == null)
				return;
			if (level > MaxLevel) {
				sum = 0;
				MaxLevel = level;
			}
			if (MaxLevel == level) {
				sum = sum + root.val;
			}
			dfs(root.left, level + 1);
			dfs(root.right, level + 1);
		}
	}
}
