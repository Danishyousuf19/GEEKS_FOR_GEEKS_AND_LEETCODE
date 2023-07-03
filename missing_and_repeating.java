import java.util.ArrayList;
import java.util.Arrays;

public class missing_and_repeating {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub);
	}
	 int[] findTwoElement_1(int arr[], int n) {
	      int a[]= {-1,-1};
	      Arrays.sort(arr);
	      
	      
	      for(int i=1;i<n;i++) {
	    	  if(arr[i]==arr[i-1]) {
	    		  a[0]=arr[i];
	    	  }
	    	  else if(arr[i]-arr[i-1]>1){
	    	      a[1]=arr[i-1]+1;
	    	  }
	      }
	       
	      if(arr[0]!=1){
	          a[1]=1;
	      }
	      else if(arr[n-1]!=n){
	          a[1]=n;
	      }
	      return a;
	    }
}
