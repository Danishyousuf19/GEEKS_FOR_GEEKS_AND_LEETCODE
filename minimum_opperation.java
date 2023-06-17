
public class minimum_opperation {
	static int findMinOperation(int matrix[][], int n)
    {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			sum+=matrix[i][j];
					}
		}
		int mx=0;
		for(int i=0;i<n;i++) {
			int rsum=0;
			int csum=0;
			for(int j=0;j<n;j++) {
				rsum+=matrix[i][j];
				csum+=matrix[j][i];
				
			}
			mx=Math.max(mx, csum);
			mx=Math.max(rsum,mx);
		}
		int bsum=mx*n;
		return bsum-sum;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
