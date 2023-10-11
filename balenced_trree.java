
public class balenced_trree {
	class Node
	{
		int data;
		Node left,right;
		
		Node(int d)
		{
			data = d;
			left = right = null;		
		}
	} 
	static int height(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+Math.max(height(root.left), height(root.right));
	}
	  boolean isBalanced(Node root)
	    {
		if(root==null)return true;
		int l=height(root.left);
		int r=height(root.right);
		if(Math.abs(l-r)>1)return false;
		else {
			return true&&isBalanced(root.left)&&isBalanced(root.right);
		}
	    }
}
