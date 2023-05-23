//A Toeplitz (or diagonal-constant) matrix is a matrix in which each
//descending diagonal from left to right 
//is constant, i.e., all elements in a diagonal are same.
public class isToepliz_matrix {

	static boolean isToepliz(int mat[][], int N, int M) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 1; j++) {
            	
                if (mat[i][j] != mat[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]={{1,2,3},{4,5,6}};
System.out.println(isToepliz(a,3,2));
int b[][]= {{1, 2, 1},{ 3, 1, 3}, {1, 3, 1} };
System.out.println(isToepliz(b,3,3));
	}

}
