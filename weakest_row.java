import java.util.Arrays;

public class weakest_row {
	 public int[] kWeakestRows(int[][] mat, int k) {
	        int ans[]=new int[k];
	        int st[][]=new int[mat.length][2];
	        for(int i=0;i<mat.length;i++) {
	        	int s=0;
	        	for(int j=0;j<mat[0].length;j++) {
	        		s+=mat[i][j];
	        	}
	        	st[i][0]=s;
	        	st[i][1]=i;
	        }
	        Arrays.sort(st,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
	        for(int i=0;i<k;i++) {
	        	ans[i]=st[i][1];
	        }
	        return ans;
	    }
}
