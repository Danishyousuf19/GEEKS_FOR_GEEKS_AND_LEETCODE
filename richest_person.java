
public class richest_person {
	 public int maximumWealth(int[][] acc) {
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<acc.length;i++) {
	        	int c=0;
	        	for(int j:acc[i]) {
	        		c+=j;
	        	}
	        	if(c>max)
	        		max=c;
	        }
	        return max;
	    }
}
