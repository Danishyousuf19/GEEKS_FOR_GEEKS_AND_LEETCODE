import java.util.ArrayList;

public class snakepaattern {
	 static ArrayList<Integer> snakePattern(int matrix[][])
	    {ArrayList<Integer>list=new ArrayList<>();
	        // code here
	        int n=matrix.length;
	       
	        boolean ltr=true;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(ltr)list.add(matrix[i][j]);
	                else list.add(matrix[i][n-1-j]);
	            }
	            ltr=!ltr;
	        }
	       return list;
	        
	        
	    }
}
