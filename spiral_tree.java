import java.util.*;
public class spiral_tree {
	public class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode() {}
		    TreeNode(int val) { this.val = val; }
		    TreeNode(int val, TreeNode left, TreeNode right) {
		        this.val = val;
		        this.left = left;
		        this.right = right;
		    }
		}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	    Queue<TreeNode> q = new LinkedList<>();
	    List<List<Integer>> res = new ArrayList<>();
	    int level = 1;
	    
	    if (root == null) {
	        return res;
	    }
	    
	    q.add(root);
	    while (!q.isEmpty()) {
	        int size = q.size();
	        List<Integer> lev = new ArrayList<>();
	        
	        for (int i = 0; i < size; i++) {
	            TreeNode curr = q.poll();
	            if (level % 2 == 0) {
	                lev.add(0, curr.val);  // Add to the beginning of the list
	            } else {
	                lev.add(curr.val);
	            }
	            if (curr.left != null) {
	                q.add(curr.left);
	            }
	            if (curr.right != null) {
	                q.add(curr.right);
	            }
	        }
	        
	        res.add(lev);
	        level++;
	    }
	    
	    return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> zigzagLqevelOrder(TreeNode root) {
	    Queue<TreeNode> q = new LinkedList<>();
	    List<List<Integer>> res = new ArrayList<>();
	    Stack<Integer> s = new Stack<>();
	    int level = 1;
	    
	    if (root == null) {
	        return res;
	    }
	    
	    q.add(root);
	    while (!q.isEmpty()) {
	        int size = q.size();
	        List<Integer> lev = new ArrayList<>();
	        
	        for (int i = 0; i < size; i++) {
	            TreeNode curr = q.poll();
	            if (level % 2 == 0) {
	                s.push(curr.val);  // Use the stack for even levels
	            } else {
	                lev.add(curr.val);
	            }
	            if (curr.left != null) {
	                q.add(curr.left);
	            }
	            if (curr.right != null) {
	                q.add(curr.right);
	            }
	        }
	        
	        while (!s.isEmpty()) {
	            lev.add(s.pop());  // Pop values from the stack for odd levels
	        }
	        
	        res.add(lev);
	        level++;
	    }
	    
	    return res;
	}


}
