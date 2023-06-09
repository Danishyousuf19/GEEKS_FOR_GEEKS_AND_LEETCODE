import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class repeted_2_elements {
	public static int[] twoRepeated(int arr[], int N)
    {
		int a[]= {-1,-1};
		int idx=0;
		boolean seen[]=new boolean[N+1] ;
	for(int i=0;i<N-2;i++) {
		if(seen[arr[i]]) {
			a[idx++]=arr[i];
		}
		else {
			seen[arr[i]]=true;
		}return a;
		}
		return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 1,4};
		
		int[] repeatedElements = twoRepeated(arr, 4);

		for (int element : repeatedElements) {
		  System.out.println(element);
		}

	}

}
