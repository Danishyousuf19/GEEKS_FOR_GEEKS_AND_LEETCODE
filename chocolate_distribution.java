import java.util.ArrayList;

public class chocolate_distribution {
	  public long findMinDiff (ArrayList<Integer> a, int n, int m)
	    {
	        long min=Integer.MAX_VALUE;
	        for(int i=0;i<=n-m;i++) {
	        	min=Math.min(min, a.get(i+m-1)-a.get(i));
	        }
	        return min;
	    }
}
