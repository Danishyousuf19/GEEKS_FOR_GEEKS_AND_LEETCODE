
public class shortest_path {
	  static  int INF = Integer.MAX_VALUE;
	     static  int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	    public int shortestDistance(int N, int M, int A[][], int X, int Y) {
	        int[][] dp = new int[N][M];
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                dp[i][j] = INF;
	            }
	        }

	        backtrack(0, 0, 0, A, dp);

	        return dp[X][Y] == INF ? -1 : dp[X][Y];
	    }

	    private void backtrack(int x, int y, int steps, int[][] A, int[][] dp) {
	        int N = A.length;
	        int M = A[0].length;

	      
	        if (x < 0 || x >= N || y < 0 || y >= M || dp[x][y] <= steps || A[x][y] == 0) {
	            return;
	        }
	        dp[x][y] = steps;

	        for (int[] direction : DIRECTIONS) {
	            int nextX = x + direction[0];
	            int nextY = y + direction[1];
	            backtrack(nextX, nextY, steps + 1, A, dp);
	        }
	    }
}
