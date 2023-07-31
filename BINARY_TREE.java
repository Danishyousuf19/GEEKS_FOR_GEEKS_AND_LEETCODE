import java.util.*;

public class BINARY_TREE {
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
//BFS
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
 static int sum(node root) {
	 if(root==null) return 0;
	 int left=sum(root.left);
	 int right=sum(root.right);
	 return left+right+root.data;
 }
 static int height(node root) {
	 if(root==null) return 0;
	 int left=height(root.left);
	 int right=height(root.right);
	 return Math.max(left, right)+1;
			 
 }
 //O(n^2)
 static int diameter(node root) {
	 if(root==null)return 0;
	 //left diam
	 int d1=diameter(root.left);
	//left diam
	 int d2=diameter(root.right);
//	 diam passing through
	 int d3=height(root.left)+height(root.right)+1;
	 return Math.max(Math.max(d2, d1), d3); 
 }
 
 //O(n)
// as we can not return 2 values so we need to make class of them
 static class treeinfo{
	 int ht;
	 int diam;
	 treeinfo(int h,int d){
		 ht=h;
		 diam=d;
	 }
 }
 static treeinfo diameterN(node root) {
	 if(root==null) {
		 return new treeinfo(0,0);
	 }
//	 save the info of left and right
	 treeinfo left=diameterN(root.left);
	 treeinfo right=diameterN(root.right);
	 //calculate height for root wala diameter
	 int myht=Math.max(left.ht, right.ht)+1;
//	 ||y as upper 3 diam
	 int d1=left.diam;
	 int d2=right.diam;
	 int d3=left.ht+right.ht+1;
//	 Returning back the 2 
	 int mydiam=Math.max(Math.max(d2, d1), d3);
	 treeinfo myinfo =new treeinfo(myht,mydiam);
	 return myinfo;		 
 }
 static boolean isIdentical(node tree,node subtree) {
	 if(tree==null&&subtree==null)return true;
	 if(tree==null||subtree==null)return false;
	 if(tree.data==subtree.data) {
		 return isIdentical(tree.left,subtree.left)&&isIdentical(tree.right,subtree.right);
	 }
	 return false;
 }
 static boolean isSubTree(node tree,node subtree) {
	 if(subtree==null)return true;
	 if(tree==null)return false;
	 if(tree.data==subtree.data) {
		 return isIdentical(tree,subtree);
	 }
	 return isSubTree(tree.left,subtree)||isSubTree(tree.right,subtree);
 }
 
 
}
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
int nodes[]= {1,2,-1,-1,-1};
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
 System.out.println("sum_of_nodes");
 System.out.println(a.sum(root));
 System.out.println("height");
 System.out.println(a.height(root));
 System.out.println("diameter O(N^2)");
 System.out.println(a.diameter(root));
 System.out.println("diameter O(N)");
 System.out.println(a.diameterN(root).diam);
 System.out.println("is subtree");
 int nodes1[]= {1,2,-1,-1,-1};
 binaryTree c=new binaryTree();
 node subtree=c.build(nodes1);
 System.out.println(subtree.data);
// System.out.println(a.isSubTree(root,r));

	}

}
