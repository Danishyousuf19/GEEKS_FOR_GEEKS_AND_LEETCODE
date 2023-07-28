
public class least_common_ansistor {
	class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			this.right=null;
			this.left=null;
		}
	}
	Node LCA(Node root, int n1, int n2)
	{ 
		if(root ==null)
			return null;
		if(root.data==n1||root.data==n2)
			return root;
		Node left=LCA(root.left,n1,n2);
		Node right=LCA(root.right,n1,n2);
		if(left==null)
			return right;
		if(right==null)
			return left;
        return root;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	if(root==null)return null;
	if(root==p||root==q)return root;
	TreeNode left=lowestCommonAncestor(root.left,p,q);
	TreeNode right=lowestCommonAncestor(root.right,p,q);
	if(left==null)return right;
	if(right==null)return left;
        return root;
    }

}
