
public class flat_tree {
	
	class Solution {
		class Node{
			Node left;
			Node right;
			Node(int t)
			{		}
			
	    Node ans = new Node(-1);
	    int it = 0;
	    Node temp;
	    public Node flattenBST(Node root) {
	        // Code here
	        solve(root);
	        return temp;
	        
	    }
	    public void solve(Node node){
	        if(node.left==null && node.right==null){
	           ans.right=node;
	           
	           if(it==0){
	               temp=ans.right;
	               it++;
	           }
	           ans=ans.right;
	           ans.left=null;
	           return;
	        }
	        if(node.left!=null){
	             solve(node.left);
	        }
	        ans.right = node;
	        if(it==0){
	               temp=ans.right;
	               it++;
	           }
	        
	        ans = ans.right;
	        ans.left=null;
	        if(node.right!=null){
	            solve(node.right);
	        }
	        
	       return;
	    }
	}


	}}
