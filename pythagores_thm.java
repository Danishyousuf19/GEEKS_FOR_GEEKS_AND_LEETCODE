import java.util.HashMap;
import java.util.HashSet;

public class pythagores_thm {
	boolean checkTriplet(int[] arr, int n) {
       HashMap<Integer,Integer>sq=new HashMap<>();
       int[]dp=new int[n];
       for(int i=0;i<n;i++ ) {
    	   dp[i]=arr[i]*arr[i];
    	   sq.put(dp[i], 1);
       }
       for(int i=0;i<n;i++) {
    	   for(int j= i+1;j<n;j++) {
    		   if(sq.containsKey(dp[i]+dp[j]))return true;
    	   }
       }
       return false;
    }
	boolean checkTrihplet(int[] arr, int n) {
	       HashSet<Integer>sq=new HashSet<>();
	       int[]dp=new int[n];
	       for(int i=0;i<n;i++ ) {
	    	   dp[i]=arr[i]*arr[i];
	    	   sq.add(dp[i]);
	       }
	       for(int i=0;i<n;i++) {
	    	   for(int j= i+1;j<n;j++) {
	    		   if(sq.contains(dp[i]+dp[j]))return true;
	    	   }
	       }
	       return false;
	    }
}
