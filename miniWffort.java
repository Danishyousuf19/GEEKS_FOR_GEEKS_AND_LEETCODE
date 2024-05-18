import java.util.Arrays;
import java.util.PriorityQueue;

public class miniWffort {


	class Solution {
	    static class node {
	        int d, r, c;

	        node(int a, int b, int e) {
	            d = a;
	            r = b;
	            c = e;
	        }
	    }

	    public static int MinimumEffort(int rows, int columns, int[][] heights) {
	        int n = heights.length;
	        int m = heights[0].length;
	        int[][] dp = new int[n][m];
	        for (int i = 0; i < n; i++) {
	            Arrays.fill(dp[i], Integer.MAX_VALUE);
	        }
	        int[] r_ = {-1, 0, 1, 0};
	        int[] c_ = {0, 1, 0, -1};
	        PriorityQueue<node> q = new PriorityQueue<>((a, b) -> {
	            return a.d - b.d;
	        });
	        q.add(new node(0, 0, 0));
	        while (!q.isEmpty()) {
	            node curr = q.poll();
	            int d = curr.d;
	            int r = curr.r;
	            int c = curr.c;
	            if (r == n - 1 && c == m - 1) {
	                return d;
	            }
	            for (int i = 0; i < 4; i++) {
	                int _r = r + r_[i];
	                int _c = c + c_[i];
	                if (_r >= 0 && _r < n && _c >= 0 && _c < m) {
	                    int _d = Math.max(Math.abs(heights[r][c] - heights[_r][_c]), d);
	                    if (_d < dp[_r][_c]) {
	                        dp[_r][_c] = _d;
	                        q.add(new node(_d, _r, _c));
	                    }
	                }
	            }
	        }
	        return 0;
	    }
	}

}
