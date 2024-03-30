import java.util.Arrays;

public class Floyd_Warshall {
	int findCity(int n, int m, int[][] edges, int distanceThreshold) {
		int ans = 0;
		int adj[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(adj[i], Integer.MAX_VALUE);
		}
		for (int i = 0; i < m; i++) {
			adj[edges[i][0]][edges[i][1]] = edges[i][2];
			adj[edges[0][i]][edges[1][i]] = edges[i][2];
		}
		for (int i = 0; i < n; i++) {
			adj[i][i] = 0;
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (adj[i][k] == Integer.MAX_VALUE || adj[k][j] == Integer.MAX_VALUE)
						continue;
					adj[i][j] = Math.max(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}
		int mincnt = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int min = 0;
			for (int j = 0; j < n; j++) {
				if (adj[i][j] <= distanceThreshold) {
					min++;
				}
			}
			if (min <= mincnt) {
				ans = i;
				mincnt = min;
			}
		}

		return ans;
	}
}
