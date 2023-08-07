import java.util.Arrays;

public class binary_search_in_2D {
//	SORTED IN BOTH DIRECION
static int[] search(int [][]arr,int t) {
	int r=0;
	int c=arr[0].length-1;
	while(r<arr[0].length&&c>=0) {
		if(arr[r][c]==t) {
			return new int[] {r,c};
		}
		else if(arr[r][c]>t)
			c--;
		else {
			r++;
		}
	}
	return new int[] {-1,-1};
	
}
//SORTED MATRIX COMPLETLY
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,1}};
System.out.println(Arrays.toString(search(a,3)));
	}

}
