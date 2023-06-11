import java.util.Arrays;

public class K_largest {
	 int[] kLargest(int[] arr, int n, int k) {
	       int larg[]=new int[k];
	       int copy[]=arr.clone();
	
	       Arrays.sort(copy);
	       int m=0;
	       for(int i=n-1;i>=k;i--) {
	    	   larg[m]=copy[i];m++;
	       }
	       return larg;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
