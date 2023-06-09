
public class equal_sum {
	 String equilibrium(int arr[], int n) {
	        int sum=0;
	        for(int i=0;i<n;i++){
	            sum+=arr[i];
	        }
	        int sum1=0;
	        for(int i=0;i<n;i++){
	            if(i!=0) sum1+=arr[i-1];
	            sum-=arr[i];
	            if(sum1==sum) return "YES";
	        }
	        return "NO";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
