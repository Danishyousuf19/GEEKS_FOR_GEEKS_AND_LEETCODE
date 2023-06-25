import java.util.*;

public class binary_matrix {
	 public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
	    {
		 ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		 
		 for(int i=0;i<r;i++) {
			 ArrayList<Integer>list=new ArrayList<>();
			 for(int j=0;j<c;j++) {
				 list.add(a[i][j]);
			 }
			 if(!ans.contains(list)) {
				 ans.add(new ArrayList(list));
			 }
		 }
		 return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
