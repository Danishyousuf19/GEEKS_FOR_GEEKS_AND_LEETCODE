import java.util.*;

public class all_tree_path {
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
	public List<String> binaryTreePaths(TreeNode root) {
	       List<String>res=new ArrayList<>();
	       dfs(root,"",res);
	       return res; 
	    }
	    void dfs(TreeNode r,String a,List<String>l){
	        a+=r.val;
	        if(r.left==null&&r.right==null){
	            l.add(a);
	            return;
	        }
	        a+="->";
	        if(r.left!=null)dfs(r.left,a,l);
	        if(r.right!=null)dfs(r.right,a,l);
	    }
}
