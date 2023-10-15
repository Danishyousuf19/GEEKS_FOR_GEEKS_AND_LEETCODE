import java.util.*;

public class right_view {
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
	int max=0;
	   public List<Integer> rightSideView(TreeNode root) {
		   List<Integer>res=new ArrayList<>();
		   build(res,1,root);
	        return res;
	    }
	   void build(List<Integer> res,int l,TreeNode root) {
		   if(root==null)return ;
		   if(max<l) {
			   res.add(root.val);
			   max=l;
		   }
		   build(res,l+1,root.right);
		   build(res,l+1,root.left);
	   }
}
