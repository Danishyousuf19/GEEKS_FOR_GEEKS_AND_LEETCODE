import java.util.*;

public class binary_tree_to_bst {
	class Node
	{
	    int data;
	    Node left, right;
	    Node(int item){
	        data = item;
	        left = right = null;
	    }
	} 
	class Solution
	{ int i = 0;
	    Node binaryTreeToBST(Node root)
	    {
	       // Your code here
	       ArrayList<Integer> arr = new ArrayList<>();
	       traverse(root,arr);
	       Collections.sort(arr);
	       inorder(root,arr);
	       return root;
	    }
	    void traverse(Node root, ArrayList<Integer> arr){
	        if(root == null)
	        return;
	        arr.add(root.data);
	        traverse(root.left,arr);
	        traverse(root.right,arr);
	    }
	    void inorder(Node root, ArrayList<Integer> arr){
	        if(root == null)
	        return;
	        inorder(root.left,arr);
	        root.data = arr.get(i);
	        i++;
	        inorder(root.right,arr);
	    }}
	 
}
