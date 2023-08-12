
public class no_of_unique_paths_maize {
	

	static int path(int g[][], int r, int c, int memo[][]) {
		if (r >= g.length|| c >= g[0].length || g[r][c] == 1)
			return 0;
		if (r == g.length - 1 && c == g[0].length - 1)
			return 1;
		if (memo[r][c] > 0)
			return memo[r][c];
		int downPaths = path(g, r + 1, c, memo);
        int rightPaths = path(g, r, c + 1, memo);
        memo[r][c] = downPaths + rightPaths; // Cache the result.
        return memo[r][c];
	}

	public int uniquePathsWithObstacles(int[][] o) {
		return path(o, 0, 0, new int[o.length][o[0].length]);
	}
	

	
}
