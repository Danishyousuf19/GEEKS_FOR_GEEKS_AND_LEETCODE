import java.util.ArrayList;

public class sumOfUpperLowerTriangle {
	 static ArrayList<Integer> sumTriangles(int matrix[][], int n)
	    {
	        // code here
		 ArrayList<Integer>list=new ArrayList<>();
		 int u=0,l=0;
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=i;j<matrix[0].length;j++) {
				 u+=matrix[i][j];
			 }
		 }
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<=i;j++) {
				 l+=matrix[i][j];
			 }
		 }
		 list.add(u);
		 list.add(l);
		 return list;
		 
	    }
}
