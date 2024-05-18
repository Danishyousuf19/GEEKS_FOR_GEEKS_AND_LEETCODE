import java.util.*;
public class seriel_deserial_tree {
	class Node{
		Node left,right;
		int data;
		Node next;
		Node(int c){
			
		}
	}
	class Solution {
	    
		  
        //write code here and return the head of changed linked list
       public Node arrangeCV(Node head) {
   Node vowel = new Node('x');
        Node consonent = new Node('x');
        Node vowelHead = vowel;
        Node consonentHead = consonent;
        
        while(head!=null){
            if(head.data=='a' || head.data=='e' || head.data=='i' || head.data=='o' || head.data=='u'){
                vowel.next = head;
                vowel = vowel.next;
            }else{
                consonent.next = head;
                consonent = consonent.next;
            }
            head = head.next;
        }
        consonent.next = null;
        vowel.next = consonentHead.next;
        return vowelHead.next;
    }
}
	class Tree {
	    // Function to serialize a tree and return a list containing nodes of tree.
	    public ArrayList<Integer> serialize(Node root) {
	        // code here
	          ArrayList<Integer> result = new ArrayList<>();
	        if (root == null) {
	            return result;
	        }

	        Queue<Node> queue = new LinkedList<>();
	        queue.offer(root);

	        while (!queue.isEmpty()) {
	            Node cur = queue.poll();
	            if (cur != null) {
	                result.add(cur.data);
	                queue.offer(cur.left);
	                queue.offer(cur.right);
	            } else {
	                result.add(-1); // Placeholder for null nodes
	            }
	        }

	        return result;
	    }
	    public static boolean isPrime(int n) {
	    	if(n==2)return true;
	    	if(n%2==0)return false;
	    	for(int i = 3; i * i <= n; i+=2)
	    		if(n % i == 0) return false;
	    	return true;
	    }

	    // Function to deserialize a list and construct the tree.
	    public Node deSerialize(ArrayList<Integer> A) {
	        // code here
	          if (A == null || A.isEmpty()) {
	            return null;
	        }

	        int i = 0;
	        Node root = new Node(A.get(i++));
	        Queue<Node> queue = new LinkedList<>();
	        queue.offer(root);

	        while (!queue.isEmpty()) {
	            Node cur = queue.poll();

	            // left tree construct
	            int leftValue = A.get(i++);
	            if (leftValue != -1) {
	                cur.left = new Node(leftValue);
	                queue.offer(cur.left);
	            }

	            // right tree construct
	            int rightValue = A.get(i++);
	            if (rightValue != -1) {
	                cur.right = new Node(rightValue);
	                queue.offer(cur.right);
	            }
	        }

	        return root;
	    
	    }
	};
}
