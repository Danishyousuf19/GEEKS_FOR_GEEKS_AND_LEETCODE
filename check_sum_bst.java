
public class check_sum_bst {
	class Node {
		int data;
		Node right,left;
	}
	static int c;
	
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		c=0;
		inorder(root1,root2,x);
		return c;
	}
	static void inorder(Node r1 ,Node r2,int x) {
		if(r1==null) {
			return;
		}
		inorder(r1.left,r2,x);
		int num=x-r1.data;
		if(num>=0)bst(r2,num);
		inorder(r1.right,r2,x);
	}
	static void bst(Node r,int x) {
		if(r==null)return;
		if(r.data==x)c++;
		if(r.data<x)bst(r.left,x);
		else bst(r.right,x);
	}
}
