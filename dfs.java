import java.util.ArrayList;

public class dfs {
	class Node
	{
	    int data;
	    Node left;
	    Node right;

	    Node(int data)
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}
	  public static ArrayList<ArrayList<Integer>> Paths(Node root) {
	        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
	        // Check if the root is null, return empty list if so
	        if (root == null) return ans;
	        // Call the helper function with initial parameters
	        helperDfs(root, new ArrayList<>(), ans);
	        return ans;
	    }
	    
	    // Helper function to perform depth-first search
	    private static void helperDfs(Node root, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {
	        // Add current node's data to the list
	        list.add(root.data);
	        
	        // Check if it's a leaf node, if so, add the list to the answer
	        if (root.left == null && root.right == null) {
	            ans.add(new ArrayList<>(list)); // Create a new list to avoid reference issues
	        } else {
	            // Recursive calls for left and right children
	            if (root.left != null) {
	                helperDfs(root.left, new ArrayList<>(list), ans); // Pass a copy of the list
	            }
	            if (root.right != null) {
	                helperDfs(root.right, new ArrayList<>(list), ans); // Pass a copy of the list
	            }
	        }
	    }
}
