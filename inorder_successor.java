import java.util.ArrayList;

public class inorder_successor {
	class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	static void helper(Node r,Node x,ArrayList<Node>l) {
		if(r==null)return;
		helper(r.left,x,l);
		l.add(r);
		helper(r.right,x,l);
		
	}
	public Node inorderSuccessor(Node root,Node x)
    {
	ArrayList<Node>list=new ArrayList<>();
	helper(root,x,list);
	int s=0,e=list.size()-1,m;
	int p=0;
	while(s<=e) {
		m=s+(e-s)/2;
		if(list.get(m).data==x.data)
			{p=m;break;}
		else if(list.get(m).data>x.data)
			e=m-1;
		else
			s=m+1;
	}

	return (p==list.size()-1)?null:list.get(p+1);
	
     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
