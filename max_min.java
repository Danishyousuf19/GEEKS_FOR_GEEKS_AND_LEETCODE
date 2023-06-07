import java.util.Arrays;

public class max_min {
	public static int findSum(int A[],int N) 
    {
        Arrays.sort(A);
        int min=A[0];
        int max=A[N-1];
        return max+min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
