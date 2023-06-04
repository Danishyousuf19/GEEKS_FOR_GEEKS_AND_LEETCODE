
public class sum_array_puzzle {
	 public static void SumArray(int arr[], int n)
	    {
	        int a[]=new int [n];
	        int sum=0;
	        for(int i:arr) {
	        	sum+=i;
	        }
	        for(int i=0;i<n;i++) {
	        	arr[i]=sum-arr[i];
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
