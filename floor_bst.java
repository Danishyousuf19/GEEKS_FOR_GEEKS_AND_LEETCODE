

public class floor_bst {
	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
		}}
	  public static int floor(Node root, int x) {
	        // Code here
	        int ans=-1;
	        while(root!=null){
	            if(root.data==x)return root.data;
	            else if(root.data>x){
	                root=root.left;
	            }
	            else{
	                ans=root.data;
	                root=root.right;
	            }
	        }
	        return ans;
	    }
}
