

public class count_vg_of_subtree {
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
	class Solutighfon {
	    public int averageOfSubtree(TreeNode root) {
	        int res[]=new int[1];
	        travel(root,res);
	        return res[0];
	    }
	    int []travel(TreeNode root,int res[]){
	    	if(root==null) {
	    		return new int[] {0,0};
	    	}
	    	int left[]=travel(root.left,res);
	    	int right[]=travel(root.right,res);
	    	int sum=root.val+left[0]+right[0];
	    	int count=1+left[1]+right[1];
	    	if(sum/count==root.val)res[0]++;
	    	return new int[] {sum,count};
	    }
	}
	 
}
