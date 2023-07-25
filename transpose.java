
public class transpose {
	 public void transpose(int n,int a[][])
	    {
	        for(int i=0;i<n;i++) {
	        	int col=i+1;
	        	int row=i+1;
	        	while(row<n&&col<n) {
//	        		swap
	        		int t=a[i][col];
	        		a[i][col]=a[row][i];
	        		a[row][i]=t;
	        		row++;
	        		col++;
	        	}
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	 public void transpose2(int n,int a[][])
//	    {
//	        for(int i=0;i<n;i++) {
//	        	for(int j=i+1;j<n;j++) {
//	        		int t=a[i][j];
//	        		a[i][j]=a[j][i];
//	        		a[j][i]=t;
//	        		
//	        	}
//	        }
//	    }
	 public int[][] transpose(int[][] a
				) {
		         int n=a.length;
							 int m=a[0].length;
			        for(int i=0;i<n;i++) {
			        	for(int j=i+1;j<m;j++) {
			        		int t=a[i][j];
			        		a[i][j]=a[j][i];
			        		a[j][i]=t;
								}
							}
					return a;
		    }

}
