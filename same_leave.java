import java.util.*;

public class same_leave {
	  class TreeNode {
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
		 
		class Soluuhtion {
			int  i=0;
		    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		    	List<Integer>list=new ArrayList<>();
		    	find1(root1,list);
		    	if(find2(root2,list)&&i==list.size())
		    		return true;
		    	
				return false;
		        
		    }
		    public boolean find2(TreeNode root,List<Integer>list) {
		    	if(root==null)return true;
		    	if(root.left==null&&root.right==null) {
		    		if(i==list.size())return false;
		    		if(list.get(i)!=root.val)return false;
		    		i++;
		    		return true;
		    	}
		    	if(!find2(root.left,list))return false;
		    	if(!find2(root.right,list))return false;
		    	return true;
		    }
		    public void find1(TreeNode root,List<Integer>list) {
		    	if(root==null) {
		    		return;
		    	}
		    	if(root.left==null&&root.right==null) {
		    		list.add(root.val);
		    	}
		    	find1(root.left,list);
		    	find1(root.right,list);
		    	
		    }
		}
}
