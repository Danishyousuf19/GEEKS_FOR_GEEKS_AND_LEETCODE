public class SumRowsCols {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int rs = 0, cs = 0;
            for (int j = 0; j < cols; j++) {
                rs += matrix[i][j];
                cs += matrix[j][i];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rs + ", Sum of column " + (i + 1) + " = " + cs);
        }
    }
}
