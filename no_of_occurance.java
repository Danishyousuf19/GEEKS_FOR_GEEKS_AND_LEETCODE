
public class no_of_occurance {
	 int count(int[] arr, int n, int x) {
	        int l=0,r=n-1;
	        while(l<=r) {
	        	if(arr[l]<x) {
	        		l++;
	        	}
	        	if(arr[r]>x) {
	        		r--;
	        	}
	        	if(arr[l]==x&&arr[r]==x) {
	        		return r-l+1;
	        	}
	        }
	        return 0;
	    }
}
