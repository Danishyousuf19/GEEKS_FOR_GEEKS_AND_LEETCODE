
public class bitonic_point {
	 int findMaximum(int[] arr, int n) {
	        int i=0;
	        int ans=arr[n-1];
	        while(i<n&&arr[i]>=arr[i+1]) {
	        	ans=arr[i];i++;
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
