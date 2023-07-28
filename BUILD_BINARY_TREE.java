import java.util.*;

public class BUILD_BINARY_TREE {
static class node{
	int data;
	node right;
	node left;
	node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
}
static int idx=-1;
static class binaryTree{
public static node build(int []nodes) {
	idx++;
	if(nodes[idx]==-1) {
		return null;
	}
	node nue=new node(nodes[idx]);
	nue.left=build(nodes);
	nue.right=build(nodes);
	return nue;
}
//O(n)
static void preorder_travelsal(node root) {
	if(root==null)
		return;
	System.out.print(root.data+" ");
	preorder_travelsal(root.left);
	preorder_travelsal(root.right);
}
static void inorder_travelsal(node root) {
	if(root==null) return ;
	inorder_travelsal(root.left);
	System.out.print(root.data+" ");
	inorder_travelsal(root.right);
}
static void post_order(node root) {
	if(root==null) return ;
	post_order(root.left);
	post_order(root.right);
	System.out.print(root.data+" ");
}
 static void Level_order_travelsal(node root) {
	 if(root==null)
		 return;
	 Queue<node>q=new LinkedList<>();
	 q.add(root);
	 q.add(null);
	 while(!q.isEmpty()) {
		 node curr=q.remove();
		if(curr==null) {
			 System.out.println();
			 if(q.isEmpty()) 
				 break;
			 else 
				 q.add(null);
		 }
		else {
			System.out.print(curr.data+" ");
		
		if(curr.left!=null)
				 q.add(curr.left);
		if(curr.right!=null)
				 q.add(curr.right);	 
	 }
 }
}
 static int count(node root) {
	 if(root==null) return 0;
	 int right_sum=count(root.right);
	 int left_sum=count(root.left);
	 return right_sum+left_sum+1;
 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nodes[]= {1,2,4,-1,-1,-1,-1};
binaryTree a=new binaryTree();
 node root=a.build(nodes);
 System.out.println(root.data);
System.out.println("preorder_travelsal");
 a.preorder_travelsal(root);
 System.out.println("\ninorder_travelsa");
 a.inorder_travelsal(root);
 System.out.println("\npostorder_travelsal");
 a.post_order(root);
 System.out.println("\nLevel_order_travelsal");
 a.Level_order_travelsal(root);
 System.out.println("Count_nodes");
 System.out.println(a.count(root));
	}

}
