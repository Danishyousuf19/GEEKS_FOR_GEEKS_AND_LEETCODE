
public class search_matrix {
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
		int i=0;int j=n-1;
		while(i<m&j>=0) {
			if(matrix[j][i]==x) {
				return true;
			}
			else if(matrix[j][i]<x) {
				i++;
			}
			else {
				j--;
			}
		}
	    return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
