
public class max_value {
public static int maxVal(int a[], int n) {
        int tempmax=Integer.MIN_VALUE;
        int tempmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
        	tempmax=Math.max(tempmax, a[i]-i);
        	tempmin=Math.min(tempmin, a[i]-i);
        	
        }
        return tempmax-tempmin;
        		
        		
}
}
