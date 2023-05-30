import java.util.Arrays;

public class tough_competition {
	  int toughCompetitor(int[] arr, int n) {
	       Arrays.sort(arr);
	       int min=arr[1]-arr[0];
	       for (int i=0;i<n-1;i++) {
	    	   if(arr[i+1]-arr[i]<min) {
	    		   min =arr[i+1]-arr[i];
	    		   
	    	   }
	       }
	       return min;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
