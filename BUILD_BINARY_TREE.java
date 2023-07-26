
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
static void preorder_travelsal(node root) {
	if(root==null)
		return;
	System.out.print(root.data+" ");
	preorder_travelsal(root.left);
	preorder_travelsal(root.right);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nodes[]= {1,2,4,-1,-1,-1,-1};
binaryTree a=new binaryTree();
 node root=a.build(nodes);
 System.out.println(root.data);
 a.preorder_travelsal(root);
	}

}
