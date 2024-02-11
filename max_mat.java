
public class max_mat {
	class Solution {
	    public int[][] modifiedMatrix(int[][] matrix) {
	        // Get the number of rows (m) and columns (n) in the matrix
	        int m = matrix.length;
	        int n = matrix[0].length;

	        // Create a new matrix "ans" filled with zeros
	        int[][] ans = new int[m][n];

	        // Create an array "col" to store maximum elements in each column, initially filled with -1
	        int[] col = new int[n];
	        Arrays.fill(col, -1);

	        // Step 1: Iterate through each column of the matrix
	        for (int i = 0; i < n; i++) {
	            // Step 2: Iterate through each row of the matrix
	            for (int j = 0; j < m; j++) {
	                // Step 3: Copy elements from the original matrix to the "ans" matrix
	                ans[j][i] = matrix[j][i];
	                
	                // Update the "col" array with the maximum element in the current column
	                col[i] = Math.max(col[i], matrix[j][i]);
	            }
	        }

	        // Step 4: Iterate through each element in the "ans" matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                // Step 5: If the element is -1, replace it with the maximum value from its column
	                if (ans[j][i] == -1) {
	                    ans[j][i] = col[i];
	                }
	            }
	        }

	        // Return the modified "ans" matrix
	        return ans;
	    }
	} 
}
