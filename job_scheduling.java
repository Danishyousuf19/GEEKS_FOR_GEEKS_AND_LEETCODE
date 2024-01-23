import java.util.*;

public class job_scheduling {
	static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) {
		// add your code here
		int indegree[] = new int[n];
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		for (ArrayList<Integer> pre : prerequisites) {
			int u = pre.get(1);
			int v = pre.get(0);
			indegree[v]++;
			graph.get(u).add(v);
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if (indegree[i] == 0)
				q.add(i);
		}
		int idx = 0;
		ArrayList<Integer> res = new ArrayList<>();
		while (!q.isEmpty()) {
			int u = q.poll();
			res.add(u);
			idx++;
			for (int v : graph.get(u)) {
				indegree[v]--;
				if (indegree[v] == 0) {
					q.add(v);
				}
			}
		}
		if (idx == n) {
			int order[] = new int[n];
			for (int i = 0; i < n; i++) {
				order[i] = res.get(i);
			}
			return order;
		}
		return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
