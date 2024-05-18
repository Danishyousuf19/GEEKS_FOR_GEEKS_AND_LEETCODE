
public class max_sum_array {
	int findMaxSum(int n, int m, int mat[][]) {
        int maxi = -1;
        
        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j < m - 1; j++) {
                int sum = mat[i - 1][j - 1] + mat[i - 1][j] + mat[i - 1][j + 1] + mat[i][j] + mat[i + 1][j - 1] + mat[i + 1][j] + mat[i + 1][j + 1];
                maxi = Math.max(maxi, sum);
            }
        }
        
        return maxi;
    }

}
