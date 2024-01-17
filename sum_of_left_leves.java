
public class sum_of_left_leves {
class TreeNode{
	TreeNode right,left;
	int val;
	
}

class Solution {
    public int sumOfLeftLeavesHelper(TreeNode root,boolean isLeft)
    {
        // If the tree is empty, sum is 0.
        if(root==null)
            return 0;
        // If current node is leaf node and if it is left node, then return its value
        if(root.left==null && root.right==null && isLeft==true)
         return root.val;
        // Perform the same on left and right subtrees, and return their sum. Whenever calling left subtree, pass true as isLeft, because its on left.
        return sumOfLeftLeavesHelper(root.left,true)+sumOfLeftLeavesHelper(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        // If the tree is empty, sum is 0.
        if(root==null)
            return 0;
        // Perform the same on left and right subtrees, and return their sum. Whenever calling left subtree, pass true as isLeft, because its on left.
        return sumOfLeftLeavesHelper(root.left,true)+sumOfLeftLeavesHelper(root.right,false); 
     
    }
}
}
