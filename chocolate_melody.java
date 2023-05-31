import java.util.Arrays;

public class chocolate_melody {
	 public static int max_adjacent_sum (int arr[], int n) {
	        //Complete the function
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++) {
			max=Math.max(max, arr[i]+arr[i+1]);
		}
		return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
