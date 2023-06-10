
public class row_min_1s {
	int minRow(int N, int M, int A[][]) {
       int arr[]=new int [N];
       int max =0;
       int k=0;
       for (int i=0;i<N;i++) {
    	   int c=0;
    	   for(int j=0;j<M;j++) {
    		   if(A[i][j]==0) {
    			   c++;
    		   }
    	   }
    	   if(c>max) {
    		   max=c;
    		   arr[k++]=max;
    	   }
    	   else {
    		   arr[k++]=0;
    	   }
       }
       for(int i=0;i<N;i++)
       {
    	   if(arr[i]==max) {
    		   return i;
    	   }
       }
       return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
