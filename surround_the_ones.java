
public class surround_the_ones {

	 public int Count(int[][] matrix) {
			int c = 0;
			  int dx[]={1,0,0,-1,1,1,-1,-1};
	        int dy[]={0,1,-1,0,1,-1,-1,1};
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (matrix[i][j] == 0)
						continue;
					int temp = 0;

					for (int k = 0; k < 8; k++) {
						int ni=i+dx[k];
						int nj=j+dy[k];
						if(ni>=0&&nj>=0&&ni<matrix.length&&nj<matrix[0].length&&matrix[ni][nj]==0)
							temp++;
					}
					if(temp%2==0&&temp>0)c++;;
				}
			}
			return c;
		}
}
