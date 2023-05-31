import java.util.Arrays;

public class Product_of_maximum_in_first_array_and_minimu_in_second {
	 public static long find_multiplication (int arr[], int brr[], int n, int m) {
	        // Complete the Function
		 Arrays.sort(arr);
		 Arrays.sort(brr);
		 return arr[n-1]*brr[0];
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
