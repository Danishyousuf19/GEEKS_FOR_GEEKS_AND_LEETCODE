import java.util.*;

public class vertical_dsum {
	class Node{
		int data;
		Node left, right;
		Node(int item)
		{
		    data = item;
		    left = right = null;
		}
		}
		
		class Solution{
		    public ArrayList <Integer> verticalSum(Node root) {
		        // add your code here
		    	Map<Integer,Integer>map=new TreeMap<>();
		    	helper(root,0,map);
		    	ArrayList<Integer> res=new ArrayList<>();
		    	for(int i:map.values()) {
		    		res.add(i);
		    	}
				return res;
		    	
		    }
		    void helper(Node h,int i,Map<Integer,Integer>map) {
		    	if(h==null) {
		    		return ;
		    	}
		    	map.put(i,map.getOrDefault(i,0)+h.data);
		    	helper(h.left,i-1,map);
		    	helper(h.right,i+1,map);
		    }
		}

}
