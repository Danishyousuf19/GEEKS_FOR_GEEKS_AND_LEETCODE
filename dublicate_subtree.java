import java.util.*;

public class dublicate_subtree {
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
	class Sol{
		  private Map<String, Integer> mp = new HashMap<>();

		    String func(Node root) {
		        if (root == null) return "";

		        String l = func(root.left);
		        String r = func(root.right);

		        String s = Integer.toString(root.data) + l + r;

		        mp.put(s, mp.getOrDefault(s, 0) + 1);
		        return s;
		    }

		    int dupSub(Node root) {
		        func(root);
		        int cnt = 0;
		        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
		            if (entry.getKey().length() >= 2 && entry.getValue() > 1) {
		                cnt = 1;
		                break;
		            }
		        }
		        return cnt;
		    }
}
