
public class sum_of_levea {
	class Node
	{
	    int data;
	    Node left, right;
	    Node(int key)
	    {
	        data = key;
	        left = right = null;
	    }
	}
	class Solutasxasion
	{
	  
	    public static int sumOfLeafNodes(Node root)
	    {
	    
	        if(root==null){
	            return 0;
	        }
	        if(root.left==null&&root.right==null){
	            return root.data;
	        }
	        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);
	        
	    
	    }
	}
}
