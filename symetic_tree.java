
public class symetic_tree {
	  // return true/false denoting whether the tree is Symmetric or 
class Node{
	Node right,left;
	int data;
} static boolean solve(Node left, Node right) {
    if(left == null || right == null)
        return left == right;
        
    if(left == null && right == null)
        return true;
        
    if(left.data != right.data)
        return false;
        
    return solve(left.left, right.right) && solve(left.right, right.left);
}

public static boolean isSymmetric(Node root) {
    return root == null || solve(root.left, root.right);
}

}
