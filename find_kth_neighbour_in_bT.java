import java.util.*;

public class find_kth_neighbour_in_bT {
	class Node {
		int data;
		Node left, right;
	}

	static Node findroot(Node root, int t) {
		if (root == null || root.data == t)
			return root;
		Node left = findroot(root.left, t);
		Node right = findroot(root.right, t);
		return left != null ? left : right;

	}

	static void parent_marker(HashMap<Node, Node> parent_trap, Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			if (curr.left != null) {
				parent_trap.put(curr.left, curr);
				q.add(curr.left);
			}
			if (curr.right != null) {
				parent_trap.put(curr.right, curr);
				q.add(curr.right);
			}
		}
	}

	public static ArrayList<Integer> KDistanceNodes(Node root, int t, int k) {
		HashMap<Node, Node> parent_trap = new HashMap<>();
		parent_marker(parent_trap, root);
		Queue<Node> q = new LinkedList<>();
		q.add(findroot(root,t));
		HashMap<Node, Boolean> visted = new HashMap<>();
		visted.put(findroot(root,t),true);
		int l=0;
		while(!q.isEmpty()) {
			int n=q.size();
		if(l==k)break;
		l++;
		for(int i=0;i<n;i++){
			Node curr=q.poll();
			if(curr.left!=null&&visted.get(curr.left)==null) {
				q.add(curr.left);
				visted.put(curr.left, true);
			}
			if(curr.right!=null&&visted.get(curr.right)==null) {
				q.add(curr.right);
				visted.put(curr.right, true);
			}
			if(parent_trap.get(curr)!=null&&visted.get(parent_trap.get(curr))==null) {
				q.add(parent_trap.get(curr));
				visted.put(parent_trap.get(curr), true);
			}
		}
		}
		ArrayList<Integer> sol = new ArrayList<>();
		while (!q.isEmpty()) {
			sol.add(q.poll().data);
		}
		Collections.sort(sol);
		return sol;
	}
}
