import java.util.HashSet;
import java.util.Set;

public class at_saeme_level {
	class Node
	{
	    int data;
	    Node left, right;

	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	
	class Solution
	{
	    boolean check(Node root)
	    {
		// Your code here	
		Set<Integer>level=new HashSet<>();
		helper(root,0,level);
		return level.size()==1;
		
	    }
	    void helper(Node root,int l,Set<Integer>level){
	        if(root==null)return;
	        if(root.left==null&&root.right==null)level.add(l);
	        helper(root.left,l+1,level);
	        helper(root.right,l+1,level);
	    }
	}

}
