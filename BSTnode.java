class BSTNode {
    int info;
    BSTNode left;
    BSTNode right;

    public BSTNode(int info) {
        this.info = info;
        left = null;
        right = null;
    }
    
    public void insert(int value) {
        if (value <= info) {
            if (left == null) {
                left = new BSTNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BSTNode(value);
            } else {
                right.insert(value);
            }
        }
    }


    public void preOrderTraversal() {
        System.out.print(info + " ");
        if (left != null) left.preOrderTraversal();
        if (right != null) right.preOrderTraversal();
    }

    public void inOrderTraversal() {
        if (left != null) left.inOrderTraversal();
        System.out.print(info + " ");
        if (right != null) right.inOrderTraversal();
    }

    public void postOrderTraversal() {
        if (left != null) left.postOrderTraversal();
        if (right != null) right.postOrderTraversal();
        System.out.print(info + " ");
    }
}
public class BSTnode{
	public static void main (String a[]) {
		BSTNode b=new BSTNode(4);
		b.insert(5);
		b.insert(15);
		b.insert(2);
		b.inOrderTraversal();
	}
}


