import java.util.LinkedList;
import java.util.Queue;

public class short_height {
	 
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
	  
	class Solution {
	    public int minDepth(TreeNode root) {
	        if(root==null)return 0;
	        int c=1;
	         Queue<TreeNode> q = new LinkedList<>();
	         q.add(root);
	         while(!q.isEmpty())

	         {
	             int l=q.size();
	             for(int i=0;i<l;i++){
	                 TreeNode t=q.poll();
	                 if(t.left==null&&t.right==null)return c;
	                 if(t.left!=null)
	                {
	                    q.add(t.left);
	                }
	                if(t.right!=null)
	                {
	                    q.add(t.right);
	                }
	             }
	             c++;
	         }
	         return c;
	    }
	}
}
