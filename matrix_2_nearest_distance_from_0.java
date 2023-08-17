import java.util.*;

public class matrix_2_nearest_distance_from_0 {
	 public int[][] updateMatrix(int[][] mat) {
	        if(mat.length==0||mat[0].length==0||mat==null)return new int[0][0];
	        Queue<int[]>q=new LinkedList<>();
	        int m=mat.length;
	        int n=mat[0].length;
	        int max=m*n;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(mat[i][j]==0) q.offer(new int[]{i,j});
	                else mat[i][j]=max;
	            }
	        }
	        int [][]dir={
	            {1,0},
	            {-1,0},
	            {0,1},
	            {0,-1}
	        };
	        while(!q.isEmpty()){
	            int []curr=q.poll();
	            for(int []d:dir){
	                int r=curr[0]+d[0],c=curr[1]+d[1];
	                if(r>=0&&r<m&&c>=0&&c<n&&mat[r][c]>mat[curr[0]][curr[1]]+1){
	                    q.offer(new int[]{r,c});
	                    mat[r][c]=mat[curr[0]][curr[1]]+1;
	                }
	            }
	        }
	        return mat;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
