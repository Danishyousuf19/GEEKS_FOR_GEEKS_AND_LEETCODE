import java.util.*;

// Class for implementing Disjoint Set Union (DSU) data structure
class DisjointSet {
	private int[] parent, size;

	public DisjointSet(int n) {
		parent = new int[n];
		size = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	public int findPar(int node) {
		// Find the root of the set to which 'node' belongs
		if (node == parent[node]) {
			return node;
		}
		// Path compression: Make the parent of 'node' the root
		return parent[node] = findPar(parent[node]);
	}

	public void unionBySize(int u, int v) {
		// Union by size to merge two sets
		int par_u = findPar(u);
		int par_v = findPar(v);

		if (par_u == par_v) {
			return;
		}
		if (size[par_u] < size[par_v]) {
			parent[par_u] = par_v;
			size[par_v] += size[par_u];
		} else {
			parent[par_v] = par_u;
			size[par_u] += size[par_v];
		}
	}
}

class Solution {
	public List<List<String>> accountsMerge(List<List<String>> accounts) {
		Map<String, Integer> mails = new HashMap<>();
		int n = accounts.size();
		DisjointSet ds = new DisjointSet(n);

		// Iterate through accounts and build disjoint sets
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < accounts.get(i).size(); j++) {
				String mail = accounts.get(i).get(j);
				if (!mails.containsKey(mail)) {
					mails.put(mail, i);
				} else {
					ds.unionBySize(i, mails.get(mail));
				}
			}
		}

		// Group merged emails based on disjoint sets
		List<String>[] mergedMails = new ArrayList[n];
		for (Map.Entry<String, Integer> entry : mails.entrySet()) {
			int node = ds.findPar(entry.getValue());
			String mail = entry.getKey();
			if (mergedMails[node] == null) {
				mergedMails[node] = new ArrayList<>();
			}
			mergedMails[node].add(mail);
		}

		// Construct the final result
		List<List<String>> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (mergedMails[i] == null || mergedMails[i].size() == 0) {
				continue;
			}
			List<String> temp = new ArrayList<>();
			temp.add(accounts.get(i).get(0));
			Collections.sort(mergedMails[i]);
			temp.addAll(mergedMails[i]);
			ans.add(temp);
		}
		return ans;
	}
}

public class account_manager {
	public static void main(String[] args) {
		// Input
		int N = 4;
		List<List<String>> accounts = Arrays.asList(
				Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
				Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
				Arrays.asList("Mary", "mary@mail.com"),
				Arrays.asList("John", "johnnybravo@mail.com")
		);

		// Create an instance of the Solution class
		Solution obj = new Solution();

		// Call the accountsMerge function
		List<List<String>> result = obj.accountsMerge(accounts);

		// Display the result
		for (List<String> vec : result) {
			for (String str : vec) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
}
