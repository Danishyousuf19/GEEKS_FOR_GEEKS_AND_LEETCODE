import java.util.*;

public class shuffle {
	 void shuffleArray(long arr[], int n)
	    {
	        List<Long> l = new ArrayList<>();
	        int i = 0, mid = (int)(n / 2);
	        
	        while(i < mid && mid < n) 
	        {
	            l.add(arr[i]);
	            l.add(arr[mid]);
	            i++;
	            mid++;
	        }
	        
	        for(i = 0; i < n; i++)
	            arr[i] = l.get(i);
	    }
}
