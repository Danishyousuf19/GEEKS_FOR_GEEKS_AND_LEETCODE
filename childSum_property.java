
public class childSum_property {
	
	class kSolution
	{
		class Node{
			int data;
			Node left,right;
		}
	    public static int isSumProperty(Node root)
	    {
	        if(root==null) return 1;
	        if(root.left==null & root.right==null) return 1;
	        int sum=0;
	        if(root.left!=null)sum+=root.left.data;
	        if(root.right!=null)sum+=root.right.data;
	        if(root.data==sum) return (isSumProperty(root.left)&isSumProperty(root.right));
	        return 0;
	    }
	}
}
