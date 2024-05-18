import java.util.*;
public class reverse_travelsal {
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
	

	class Tree
	{
	    public ArrayList<Integer> reverseLevelOrder(Node root) 
	    {
	        // code here
	        ArrayList<Integer> list = new ArrayList<>();
	        Queue<Node> qu = new LinkedList<>();
	        if(root != null)qu.add(root);
	        while(qu.size() > 0){
	            Node temp = qu.peek();
	            if(temp.right != null)qu.add(temp.right);
	            if(temp.left != null)qu.add(temp.left);
	            list.add(temp.data);
	            qu.remove();
	        }
	        Collections.reverse(list);
	        return list;
	    }
	}     
}
