import java.util.ArrayList;

public class right_view_of_binary_tree {
	class Node
	{
	    int data;
	    Node left, right;
	    public Node(int data)
	    {
	        this.data = data;
	         left = right = null;
	    }
	}
	 ArrayList<Integer> rightView(Node node) {
	        ArrayList<Integer>res=new ArrayList<>();
	        rightview(node ,res,0);
	        return res;
	    }
	public static void rightview(Node root,ArrayList<Integer>res,int level) {
		if(root==null) return;
		if(level==res.size()) res.add(root.data);
		rightview(root.right,res,level+1);
		rightview(root.left,res,level+1);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
