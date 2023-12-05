import java.util.Arrays;

public class geet_min_difff {
	 int getMinDiff(int[] arr, int n, int k) {
	        // code here
	        Arrays.sort(arr);
	        int min=arr[0];
	       
	        int max=arr[n-1];
	        int res=max-min;
	        for(int i=0;i<n-1;i++){
	            if(arr[i+1]-k<0)continue;
	           min=Math.min(arr[0] + k, arr[i + 1] - k);
	           max= Math.max(arr[i] + k, arr[n - 1] - k);
	           res=Math.min(res,max-min);
	        }
	        return res;
	    }
}
