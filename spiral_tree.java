import java.util.*;

public class spiral_tree {
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
        // code here 
	
	ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer>result=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        if(root==null) return result;
        q.add(root);
        
        int level=1;
        
        while(!q.isEmpty()) {
        	int size = q.size();
        	for(int i=0;i<size;i++) {
        		Node curr=q.poll();
        		if(level%2==0)
        			result.add(curr.data);
        		else 
        			s.push(curr.data);
        		if(curr.left!=null)
        			q.add(curr.left);
        		if(curr.right!=null)
        			q.add(curr.right);
        	}
        	if(level%2!=0) {
        		while(!s.isEmpty()) {
        			result.add(s.pop());
        		}
        	}
        	level++;
        }
        
        
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
