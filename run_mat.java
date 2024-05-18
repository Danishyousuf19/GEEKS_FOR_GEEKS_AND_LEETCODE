import java.util.ArrayDeque;
import java.util.Queue;

public class run_mat {
	class Solution {
	    public int[] FindExitPoint(int n, int m, int[][] matrix) {
	        int i = 0, j = 0;
	        int dir = 1;

	        while (i < n && j < m && i >= 0 && j >= 0) {
	            if (matrix[i][j] == 1) {
	                matrix[i][j] = 0;
	                switch (dir) {
	                    case 1:
	                        dir = 2;
	                        break;
	                    case 2:
	                        dir = 3;
	                        break;
	                    case 3:
	                        dir = 4;
	                        break;
	                    case 4:
	                        dir = 1;
	                        break;
	                }
	            }

	            switch (dir) {
	                case 1:
	                    j++;
	                    break;
	                case 2:
	                    i++;
	                    break;
	                case 3:
	                    j--;
	                    break;
	                case 4:
	                    i--;
	                    break;
	            }
	        }

	        switch (dir) {
	            case 1:
	                j--;
	                break;
	            case 2:
	                i--;
	                break;
	            case 3:
	                j++;
	                break;
	            case 4:
	                i++;
	                break;
	        }

	        return new int[] {i, j};
	    }
	}
	class Solutihuon {
	     class Pair{
	        int r,c;
	        Pair(int r,int c){
	            this.r=r;
	            this.c=c;
	        }
	    }
	    
	    public int[] FindExitPoint(int n, int m, int[][] matrix) {
	        
	        int dx[]={1,0,-1,0};
	        int dy[]={0,-1,0,1};
	        int count=3; //count of 1's
	        
	        Queue<Pair> q=new ArrayDeque<Pair>();
	        q.add(new Pair(0,0));
	        
	        while(!q.isEmpty()){
	            
	            Pair curr=q.poll();
	            if(matrix[curr.r][curr.c]==1){
	                count=(count+1)%4;
	                matrix[curr.r][curr.c]=0;
	            }
	            
	            int r=curr.r+dx[count];
	            int c=curr.c+dy[count];
	            if(r<0 || c<0 || r>=n || c>=m){
	                return new int[]{curr.r,curr.c};
	            }

	            q.add(new Pair(r,c));
	            
	        }
	        
	        return new int[]{};
	         // code here
	    }
	}

}
