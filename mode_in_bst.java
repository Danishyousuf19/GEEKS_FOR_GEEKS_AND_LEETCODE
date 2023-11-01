import java.util.*;

public class mode_in_bst {
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
		 
		class Soljjjution {
			int currval;
			int max=0;
			int currcount=0;
			List<Integer>modes=new ArrayList<>();
		    public int[] findMode(TreeNode root) {
		    	iot(root);
		        int a[]=new int[modes.size()];
		        for(int i=0;i<modes.size();i++) {
		        	a[i]=modes.get(i);
		        }
		        return a;
		    }
		    void iot(TreeNode node) {
		    	if(node==null)return;
		    	iot(node.left);
		    	currcount=currval==node.val?currcount+1:1;
		    	if(currcount==max)modes.add(node.val);
		    	else if(currcount>max){
		    		max=currcount;
		    		modes.clear();
		    		modes.add(node.val);
		    	}
		    	currval=node.val;
		    	iot(node.right);
		    }
		}
}
