
public class sum_of_middle {
	 public int diagonalSum(int[][] mat) {
	     
	        int n=mat.length;
	        int ans=0;
	        int mid=n/2;
	        
	            for(int i=0;i<n;i++)
	            {
	                ans+=mat[i][i]+mat[i][n-i-1];
	            }
	            if(n%2==1)
	            {
	              ans-=mat[mid][mid];
	            }
	            return ans;
	     
	    }
}
