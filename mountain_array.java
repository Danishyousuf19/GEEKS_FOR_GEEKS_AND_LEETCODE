
public class mountain_array {
	 public int peakIndexInMountainArray(int[] arr) {
	        int s=0;
	        int e=arr.length-1;
	        int m;
	        while(s<e) {
	        	m=s+(e-s)/2;
	        	if(arr[m]>arr[m+1])
	        		e=m;
	        	else
	        		s=m+1;
	        }
	        return s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
