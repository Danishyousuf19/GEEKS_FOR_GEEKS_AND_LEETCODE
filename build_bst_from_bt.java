import java.util.ArrayList;

public class build_bst_from_bt {
	class Node
	{
	    int data;
	    Node right, left;
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}

	class GfG
	{
	    Node buildBalancedTree(Node root) 
	    {ArrayList<Integer>res=new ArrayList<>();
	    inorder(res,root);
			Node curr=make(res,0,res.size()-1);
	       return curr;
	    }
	  void inorder (ArrayList<Integer>res,Node root) {
		  if(root==null)return ;
		  inorder(res,root.left);
		  res.add(root.data);
		  inorder(res,root.right);
	  }
	  Node make(ArrayList<Integer>res,int l,int r) {
	    	if(l>r)return null;
	    	int mid=(l+r)/2;
	    	Node root=new Node(res.get(mid));
	    	root.left=make(res,l,mid-1);
	    	root.right=make(res,mid+1,r);
	    	return root;
	    }
	}
}
