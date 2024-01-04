import java.util.*;

public class dfs_bottom_up {
	
//	   Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode() {}
	       TreeNode(int val) { this.val = val; }
	       TreeNode(int val, TreeNode left, TreeNode right) {
	           this.val = val;
	           this.left = left;
	           this.right = right;
	       }
	   }
	  


	
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {

	        List<List<Integer>> res = new ArrayList();
	        dfs(root, res, 0);
	        return res;
	    }

	    private void dfs(TreeNode root, List<List<Integer>> res, int level) {

	        if (root == null) {
	            return;
	        }

	        if (level == res.size()) {
	            res.add(0, new ArrayList());
	        }

	        dfs(root.left, res, level + 1);
	        dfs(root.right, res, level + 1);

	        res.get(res.size() - level - 1).add(root.val);
	    }
	
public List<List<Integer>> levelOrderBjottom(TreeNode root) {
    List<List<Integer>> ans=new ArrayList<>();
    if(root==null)return ans;
    Queue <TreeNode>q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        List<Integer> temp=new ArrayList<>();
        int n=q.size();
        for(int i=0;i<n;i++){
            TreeNode curr=q.poll();
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
            temp.add(curr.val);
        }
        ans.add(0,temp);
    }
    return ans;

}
}
