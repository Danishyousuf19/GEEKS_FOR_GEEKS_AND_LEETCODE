import java.util.ArrayList;
import java.util.List;

public class digonal_mat {
	class Solution {
	    private boolean isPossible(int i, int j, int n, int m) {
	        return i < n && j < m && i >= 0 && j >= 0;
	    }
	    
	    public int[] matrixDiagonally(int[][] mat) {
	        List<Integer> ans = new ArrayList<>();
	        int n = mat.length;
	        int m = mat[0].length;

	        // 1st half
	        int i = 0;
	        int j = 0;
	        boolean flag = true;
	        while (isPossible(i, j, n, m)) {
	            if (flag) {
	                while (isPossible(i, j, n, m)) {
	                    ans.add(mat[i][j]);
	                    i--;
	                    j++;
	                }
	                i = 0;
	            } else {
	                while (isPossible(i, j, n, m)) {
	                    ans.add(mat[i][j]);
	                    i++;
	                    j--;
	                }
	                j = 0;
	            }
	            flag = !flag;
	        }

	        // 2nd half
	        if ((n & 1) != 0) {
	            i = 1;
	            j = m - 1;
	            flag = false;
	        } else {
	            i = n - 1;
	            j = 1;
	            flag = true;
	        }
	        while (isPossible(i, j, n, m)) {
	            if (flag) {
	                while (isPossible(i, j, n, m)) {
	                    ans.add(mat[i][j]);
	                    i--;
	                    j++;
	                }
	                i += 2;
	                j--;
	            } else {
	                while (isPossible(i, j, n, m)) {
	                    ans.add(mat[i][j]);
	                    i++;
	                    j--;
	                }
	                i--;
	                j += 2;
	            }
	            flag = !flag;
	        }
	        
	        // Convert List to int[]
	        int[] result = new int[ans.size()];
	        for (int k = 0; k < ans.size(); k++) {
	            result[k] = ans.get(k);
	        }
	        return result;
	    }
	}
}
