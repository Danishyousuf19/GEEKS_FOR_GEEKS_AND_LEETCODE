

public class sorted_arr_to_bst {
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
    TreeNode helper(int[]a,int i,int j){
        if(i>j)return null;
        int m=(i+j)/2;
        TreeNode root=new TreeNode(a[m]);
        root.left=helper(a,i,m-1);
        root.right=helper(a,m+1,j);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0 ,nums.length-1);
    }
}
