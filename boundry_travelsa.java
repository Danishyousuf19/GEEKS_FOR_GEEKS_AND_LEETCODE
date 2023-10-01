import java.util.ArrayList;

public class boundry_travelsa {
	static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        
        ArrayList<Integer> a = new ArrayList<>();
        
       for(Integer c=0;c<m;c++) 
       {
           a.add(matrix[0][c]);
       }
       if(n==1)
        return a;
        
        
        for(Integer r=1;r<n-1;r++)
        {
            a.add(matrix[r][m-1]);
        }
         for(Integer c=m-1;c>=0;c--)
        {
           a.add(matrix[n-1][c]);
        }
        if(m==1)
            return a;
            
        for(Integer r=n-2;r>=1;r--)
            a.add(matrix[r][0]);
        return a;
    }}
