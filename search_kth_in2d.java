import java.util.Arrays;

public class search_kth_in2d {
	public static int kthSmallest(int[][]mat,int n,int k)
	{
		 int arr[]=new int [n*n];int idx=0;
	       for(int i=0;i<n;i++) {
	    	   for(int j=0;j<n;j++) {
	    		   arr[idx++]=mat[i][j];
	    	   }
	       }
	       Arrays.sort(arr);
	       return arr[k-1];
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
