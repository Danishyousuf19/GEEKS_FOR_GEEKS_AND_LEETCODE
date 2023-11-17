
public class bst_t_cll {
	class Node{
	    int data;
	    Node left,right;
	    Node(int d){
	        data=d;
	        left=right=null;
	    }
	}
	
	
	class Solujlbtion
	{ 
	    //Function to convert binary tree into circular doubly linked list.
	    Node head, tail;
	    Node bTreeToClist(Node root)
	    {
	        // Initialize head and tail to null
	        head = tail = null;

	        // Convert binary tree to CDLL
	        bTreeToCListUtil(root);

	        // Connect the last node to the first node to make it circular
	        if (head != null && tail != null) {
	            head.left = tail;
	            tail.right = head;
	        }

	        return head;
	    }
	    
	      // Helper function to perform in-order traversal and convert the binary tree to CDLL
	    private  void bTreeToCListUtil(Node root) {
	        if (root == null)
	            return;

	        // Recursively convert left subtree
	        bTreeToCListUtil(root.left);

	        // Process the current node
	        if (tail == null) {
	            // If tail is null, it means this is the first node
	            head = root;
	        } else {
	            // Connect the previous tail to the current node
	            tail.right = root;
	            root.left = tail;
	        }

	        // Update tail to the current node
	        tail = root;

	        // Recursively convert right subtree
	        bTreeToCListUtil(root.right);
	    }
	}
	  
}
