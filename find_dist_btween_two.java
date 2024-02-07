
public class find_dist_btween_two {
	class Solution {
	    class Node {
	        int data;
	        Node left, right;
	    }

	    int findDist(Node root, int node_val_1, int node_val_2) {
	        Node lca = lowestCommonAncestor(root, node_val_1, node_val_2);
	        return distanceToNode(lca, node_val_1) + distanceToNode(lca, node_val_2);
	    }

	    int distanceToNode(Node node, int target) {
	        if (node == null) {
	            return -1;
	        }
	        if (node.data == target) {
	            return 0;
	        }

	        int leftDistance = distanceToNode(node.left, target);
	        if (leftDistance >= 0) {
	            return leftDistance + 1;
	        }

	        int rightDistance = distanceToNode(node.right, target);
	        if (rightDistance >= 0) {
	            return rightDistance + 1;
	        }

	        return -1;
	    }

	    Node lowestCommonAncestor(Node node, int node_val_1, int node_val_2) {
	        if (node == null) {
	            return null;
	        }
	        if (node.data == node_val_1 || node.data == node_val_2) {
	            return node;
	        }

	        Node leftLCA = lowestCommonAncestor(node.left, node_val_1, node_val_2);
	        Node rightLCA = lowestCommonAncestor(node.right, node_val_1, node_val_2);

	        if (leftLCA != null && rightLCA != null) {
	            return node;
	        }
	        return (leftLCA != null) ? leftLCA : rightLCA;
	    }
	}

}
