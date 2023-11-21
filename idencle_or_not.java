
public class idencle_or_not {

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class Solulkntion
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node r1, Node r2)
	{ if(r1 == null || r2 == null)
            return r1 == r2;
    
        if(r1 == null && r2 == null)
            return true;
            
        if(r1.data != r2.data)
            return false;
            
        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
	    // Code Here
	// Code Here
	}
	
}
}
