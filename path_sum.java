
public class path_sum {
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
	   public boolean hasPathSum(TreeNode root, int k) {
	        if(root==null)return false;
	        return help(root,k,0);
	    }
	    boolean help(TreeNode root,int k,int s){
	        if(root==null)return false;
	        if(root.left==null&&root.right==null){
	            s=s+root.val;
	            if(s==k)return true;
	        }
	        return help(root.left,k,s+root.val)||help(root.right,k,s+root.val);
	    }
}
