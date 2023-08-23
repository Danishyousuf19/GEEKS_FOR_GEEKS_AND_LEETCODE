import java.util.ArrayList;

public class string_in_grid {
	public int[][] searchWord(char[][] g, String w) {
		ArrayList<int[]> list = new ArrayList<>();
		int m = g.length;
		int n = g[0].length;
		int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (g[i][j] == w.charAt(0)) {
					for (int d[] : dir) {
						int r = i;
						int c = j;
						int k;
						for (k = 1; k < w.length(); k++) {
							int nr = r + d[0];
							int nc = c + d[1];
							if (nr < 0 || nc < 0 || nr >= m || nc >= n || g[nr][nc] != w.charAt(k)) {
								break;
							}
							r = nr;
							c = nc;
						}
						if (k == w.length()) {
							list.add(new int[] { i, j });
							break;
						}
					}
				}
			}
		}
		int ans[][] = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
}
