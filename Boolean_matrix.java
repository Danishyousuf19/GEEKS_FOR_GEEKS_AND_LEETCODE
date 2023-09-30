
public class Boolean_matrix {
	void booleanMatrix(int matrix[][])
	{
	    int rows = matrix.length;
	    int cols = matrix[0].length;

	    boolean rowHasOne[] = new boolean[rows];
	    boolean colHasOne[] = new boolean[cols];

	    // Traverse the matrix to mark rows and columns that contain 1
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (matrix[i][j] == 1) {
	                rowHasOne[i] = true;
	                colHasOne[j] = true;
	            }
	        }
	    }

	    // Modify the matrix based on marked rows and columns
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (rowHasOne[i] || colHasOne[j]) {
	                matrix[i][j] = 1;
	            }
	        }
	    }
	}

}
