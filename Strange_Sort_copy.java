import java.util.Arrays;

//Given an array A of non-negative integers. Sort the array i
//n ascending order such that element at the Kth position
//in unsorted array stays unmoved and all other elements are sorted.1_based index
public class Strange_Sort_copy {

	static  void strangeSort (int A[], int N, int K)
	{
		int x=A[K-1];
		A[K-1]=Integer.MAX_VALUE;
			Arrays.sort(A);	
		for(int i=N-1;i>K-1;i--) {
			A[i]=A[i-1];
		}
		A[K-1]=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
