
public class diff_bw_no_of_0_and_1 {
	public int[][] onesMinusZeros(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int row[]=new int [r];
        int col[]=new int [c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
            }
        }
       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               grid[i][j]=2*(row[i]+col[j])-r-c;
            }
        }
        return grid;
    }
}
