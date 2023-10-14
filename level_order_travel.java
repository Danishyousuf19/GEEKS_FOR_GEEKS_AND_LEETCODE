import java.util.*;

public class level_order_travel {
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
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>>list=new ArrayList<List<Integer>>();
	        if(root==null) return list;
	        Queue<TreeNode> q = new LinkedList<>();
	        q.add(root);
	      while(!q.isEmpty()){
         int levels = q.size();
         List<Integer> subLevels = new ArrayList<>();
         for(int i=0;i<levels;i++){
             if(q.peek().left!=null){
                 q.add(q.peek().left);
             }
             if(q.peek().right!=null){
                 q.add(q.peek().right);
             }
             subLevels.add(q.remove().val);
         }
         list.add(subLevels);
     }
	        return list;
	    }
}
