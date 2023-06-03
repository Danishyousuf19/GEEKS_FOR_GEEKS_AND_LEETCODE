import java.util.Arrays;

public class triple_sum_in_range {
	public static int countTripletsLessThan(int[] arr, int n, int val) {
	      
	       Arrays.sort(arr);

	       
	       int ans = 0;

	       int j, k;

	    
	       int sum;

	       
	       for (int i = 0; i < n - 2; i++) {

	           j = i + 1;
	           k = n - 1;

	         
	           while (j != k) {
	               sum = arr[i] + arr[j] + arr[k];

	               
	               if (sum > val) k--;

	              
	               else {
	                   ans += (k - j);
	                   j++;
	               }
	           }
	       }

	       return ans;
	   }

	   
	   public static int countTriplets(int arr[], int n, int a, int b) {

	      
	       int res;

	       
	       res = countTripletsLessThan(arr, n, b) -
	             countTripletsLessThan(arr, n, a - 1);

	       return res;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
