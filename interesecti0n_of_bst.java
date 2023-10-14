import java.util.ArrayList;
import java.util.Collections;

public class interesecti0n_of_bst {
	   //Function to find the nodes that are common in both BST.
	class Node{
		Node left,right;
		int data;
		Node(int d){
			left=null;
			right=null;
			data=d;
		}
	}
		public static ArrayList<Integer> findCommon(Node root1,Node root2)
	    {
			ArrayList<Integer> list=new ArrayList<>();
			travel(root1,root2,list);
			Collections.sort(list);
			return list;
	    }
		static void travel(Node r1,Node r2 ,ArrayList<Integer> list) {
		if(r1==null)return ;
		if(check(r2,r1.data))list.add(r1.data);
		travel(r1.left,r2,list);
		travel(r1.right,r2,list);
}
		static boolean check(Node r,int t) {
			if(r==null)return false;
			if(r.data==t)return true;
			else if(r.data>t) return check(r.left,t);
			else return check(r.right,t);
		}
//		way 2l
		public static ArrayList<Integer> findCommon1(Node root1,Node root2)
	    {
			ArrayList<Integer> list=new ArrayList<>();
			ArrayList<Integer> a=new ArrayList<>();
			inorder(root1,a);
			ArrayList<Integer> b=new ArrayList<>();
			inorder(root2,b);
			for(int i:a) {
				if(b.contains(i))list.add(i);
			}
			Collections.sort(list);
	    return list;
	    }
		static void inorder(Node r,ArrayList<Integer>l) {
			if(r==null)return;
			inorder(r.left,l);
			l.add(r.data);
			inorder(r.right,l);
		}
}