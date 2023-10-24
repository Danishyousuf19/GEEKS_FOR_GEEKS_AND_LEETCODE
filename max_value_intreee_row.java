import java.util.*;

public class max_value_intreee_row {
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
public List<Integer> largestValues(TreeNode root) {
	List<Integer> list=new ArrayList<>();
	if(root==null)return new ArrayList<>();
	Queue<TreeNode>q=new LinkedList<>();
	q.offer(root);
	while(!q.isEmpty()) {
		int s=q.size();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s;i++) {
			TreeNode curr=q.poll();
			max=Math.max(max, curr.val);
			if(curr.left!=null)q.offer(curr.left);
			if(curr.right!=null)q.offer(curr.right);
			
		}
		list.add(max);
	}
	return list;
    }
}
