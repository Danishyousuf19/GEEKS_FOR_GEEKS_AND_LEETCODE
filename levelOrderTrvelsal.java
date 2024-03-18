import java.util.*;


public class levelOrderTrvelsal {
	
	class Node{
		int data;
		Node left,right;
	}
	 static ArrayList <Integer> levelOrder(Node root) 
	    {
	        // Your code here
	       ArrayList<Integer> list = new ArrayList<>();
	        if(root == null) return list;
	        Queue<Node> queue = new LinkedList<>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	            Node removed = queue.remove();
	            list.add(removed.data);
	            if(removed.left != null) queue.add(removed.left);
	            if(removed.right != null) queue.add(removed.right);
	        }
	        return list;  
	    }
}
