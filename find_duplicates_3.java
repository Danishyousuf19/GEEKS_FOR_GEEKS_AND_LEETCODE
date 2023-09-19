import java.util.ArrayList;
import java.util.Arrays;

public class find_duplicates_3 {
	public static ArrayList<Integer> duplicates(int arr[], int n) {
     Arrays.sort(arr);
      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<n-1;i++) {
    	  if(arr[i]==arr[i+1])
    	  {
    		  list.add(arr[i]);
    		  while(i<n-1&&arr[i]==arr[i+1]) {
    			  i++;
    		  }
    	  }
      }
      
      ArrayList<Integer> l=new ArrayList<>();
      l.add(-1);
      return list.isEmpty()?l:list;
    }
}
