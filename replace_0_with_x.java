
public class replace_0_with_x {
	class Solution {
	    // Define the possible directions to explore neighboring cells
	    private final int[] r = {-1, 0, 1, 0};
	    private final int[] c = {0, 1, 0, -1};

	    // Depth-First Search (DFS) function to recursively mark connected 'O' cells as visited
	    public void dfs(int i, int j, int n, int m, char[][] mat, boolean[][] vis) {
	        // Mark the current cell as visited
	        vis[i][j] = true;

	        // Explore all four possible directions from the current cell
	        for (int k = 0; k < 4; ++k) {
	            int ni = i + r[k];  // Calculate the next row index
	            int nj = j + c[k];  // Calculate the next column index

	            // Check if the next cell is within bounds, contains 'O', and is unvisited
	            if (ni >= 0 && ni < n && nj >= 0 && nj < m && mat[ni][nj] == 'O' && !vis[ni][nj]) {
	                // Recursively explore the next cell
	                dfs(ni, nj, n, m, mat, vis);
	            }
	        }
	    }

	    // Function to fill surrounded regions with 'X'
	    public char[][] fill(int n, int m, char[][] mat) {
	        // Create a boolean matrix to mark visited cells
	        boolean[][] vis = new boolean[n][m];

	        // Loop through each cell in the matrix
	        for (int i = 0; i < n; ++i) {
	            for (int j = 0; j < m; ++j) {
	                // If the current cell is on the boundary and contains 'O' and is unvisited
	                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && mat[i][j] == 'O' && !vis[i][j]) {
	                    // Start a DFS traversal from the boundary 'O' cell
	                    dfs(i, j, n, m, mat, vis);
	                }
	            }
	        }

	        // After DFS, any remaining unvisited 'O' cells are surrounded and should be changed to 'X'
	        for (int i = 0; i < n; ++i) {
	            for (int j = 0; j < m; ++j) {
	                if (mat[i][j] == 'O' && !vis[i][j]) {
	                    mat[i][j] = 'X';
	                }
	            }
	        }

	        // Return the modified matrix
	        return mat;
	    }}
}
