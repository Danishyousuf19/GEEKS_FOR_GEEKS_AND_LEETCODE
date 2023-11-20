import java.util.ArrayList;

public class count_sum_in_path {
	class Node{
		public static final count_sum_in_path.Node right = null;
		Node next;
		int data;
		public count_sum_in_path.Node left;
		Node(int d){
			d=data;
			next=null;
		}
	}
	
	int c=0;
	void helper(Node root,ArrayList<Integer>list,int k) {
		if(root==null)return;
		list.add(root.data);
		int size=list.size();
		int sum=0;
		 for(int i=size-1;i >=0;i--){
			sum+=list.get(i);
			if(sum==k)c++;
		   }
        helper(root.left,list,k);
        helper(root.right,list,k);
        list.remove(list.size()-1);
	}
	 public int sumK(Node root,int k)
	    {
		 ArrayList<Integer>list=new ArrayList<>();
		 helper(root,list,k);
	       return c;
		
	    }
}
