import java.util.Arrays;

public class max_width {
	 public int maxWidthOfVerticalArea(int[][] p) {
	       int a = 0;
	        int b[]=new int[p.length] ;
	        for(int i=0;i<p.length;i++){
	            b[i]=p[i][0];
	        }
	        Arrays.sort(b);

	         for (int i = 1; i < p.length; i++) {
	             a=Math.max(a,b[i]-b[i-1]);
	            }

	        return a;
	    }
}
