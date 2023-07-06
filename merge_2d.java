import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class print_altternative {

	 public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
	    {
		 
	        ArrayList<Integer>a=new ArrayList<>();
	        
	        for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr[i].length;j++) {
	        		a.add(arr[i][j]);
	        	}
	        
	        }
	        Collections.sort(a);
	        return a;
	        
	        
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
