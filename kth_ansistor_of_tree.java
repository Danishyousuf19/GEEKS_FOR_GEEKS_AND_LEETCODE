
public class kth_ansistor_of_tree {
	class Node {
	    int data;
	    Node left, right;
	    
	    public Node(int data){
	        this.data = data;
	    }
	}
	 public int kthAncestor(Node root, int k, int node)
	    {
	       int ans[]= {-1};
	       int count []=new int [1];
	       dfs(root,k,node,count,ans);
	       return ans[0];
	    
	    }
	 public static boolean dfs(Node root,int k,int node ,int count[],int ans[]) {
		 if(root==null)  return false;
		 if(root.data==node)  return true;
		 if((dfs(root.right,k,node,count,ans)||(dfs(root.left,k,node,count,ans)))){
			 count[0]++;
			 if(count[0]==k) {
				 ans[0]=root.data;
			 }
			 return true;
		 }
		 
		 return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
