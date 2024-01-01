import java.util.*;

public class can_pair {
	 public boolean canPair(int[] nums, int k) {
	        // Code 
	        Set<Integer>rem=new HashSet<>();
	        for(int i:nums){
	            int r=i%k;
	            if(rem.contains((k-r)%k))rem.remove((k-r)%k);
	            else rem.add(r);
	        }
	        return rem.isEmpty();
	    }
}
