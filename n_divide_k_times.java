import java.util.HashSet;

public class n_divide_k_times {
	 public int countOccurence(int[] arr, int n, int k) 
	    {int c=0;
	    int div=n/k;
	    HashSet<Integer>set=new HashSet<>();
	    for(int i=0;i<n;i++) {
	    	int x=0;
	    	
	    			if(!set.contains(arr[i])) {
	    			for(int j=0;j<n;j++) {
	    				
	    				if(arr[i]==arr[j]) {
	    					x++;
	    				}
	    			}
	    			
	    			if(x>=div) {
	    				c++;
	    			}
	    			
	    			}
	    			set.add(arr[i]);
	    }
	        return c;
	    }
}
