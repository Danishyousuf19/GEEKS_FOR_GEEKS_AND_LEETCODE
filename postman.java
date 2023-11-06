import java.util.*;

public class postman {
	  static int getSum(int n, int m, int i, int j, int[][] mat, int[][] directions) {
	        int sum=0;
	        for(int[] dir:directions) {
	            int ni=i+dir[0], nj=j+dir[1];
	            if(ni>=0 && ni<n && nj>=0 && nj<m) sum += mat[ni][nj];
	        }
	        return sum;
	    }
	    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
	    {
	        // code here
	        List<Integer> ans = new ArrayList<>();
	        int directions1[][] = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
	        int directions2[][] = { {-2, -2}, {-2, -1}, {-2, 0}, {-2, 1}, {-2, 2}, {-1, 2}, {0, 2}, {1, 2},
	        		{2, 2}, {2, 1}, {2, 0}, {2, -1}, {2, -2}, {1, -2}, {0, -2}, {-1, -2}};
	        for(int[] query:queries) {
	            if(query[0] == 1) ans.add(getSum(n, m, query[1], query[2], mat, directions1));
	            else ans.add(getSum(n, m, query[1], query[2], mat, directions2));
	        }
	        return ans;
	    }
}
