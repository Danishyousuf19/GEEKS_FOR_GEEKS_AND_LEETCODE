
public class laargest_subSquare {
	int largestSubsquare(int n, char a[][]) {
		// code here
		int max=0;
		int[][] top = new int[n][n];
		int[][] left = new int[n][n];
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=0&&a[i][j]=='X') {
					top[i][j]=top[i-1][j]+1;
				}
				else {
					top[i][j]=1;
				}
			}
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j!=0&&a[i][j]=='X') {
					left[i][j]=top[i][j-1]+1;
				}
				else {
					left[i][j]=1;
				}
			}
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(top[i][j]==0||left[i][j]==0)
					continue;
				int cur=Math.min(top[i][j], left[i][j]);
				while(cur>0) {
					int _i=i-cur+1;
					int _j=j-cur+1;
					if(top[i][_j]>=cur&&left[_i][j]>=cur) {
						max=Math.max(max, cur);
						break;
					}
							
					cur--;
				}
			}
		}
		
		
		return max;
	}
	
}
