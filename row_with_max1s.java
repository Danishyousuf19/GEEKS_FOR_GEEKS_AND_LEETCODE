
public class row_with_max1s {
	 static int rowWithMax1s(int arr[][], int n, int m) {
	        int max=Integer.MIN_VALUE;
	        int flag=-1;
	        for(int i=0;i<n;i++) {
	        	int c=0;
	        	for(int j=0;j<m;j++) {
	        		if(arr[i][j]==1) {
	        			c++;
	        		}
	        	}if(c>max) {
	        		max=c;
	        		flag=i;
	        	}
	        }
	        return flag;
	        		
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[][] = {{0, 1, 1, 1},{0, 0, 1, 1}, {1, 1, 1, 1},  {0, 0, 0, 0}};
		   int[][] arr= {{1,0},{1,1}};       
		         
		int x=rowWithMax1s(Arr,4,4);
		System.out.println(x);

	}

}
