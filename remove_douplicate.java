import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class remove_douplicate {
	int remove_duplicate_hashSet(int A[], int N) {
	    HashSet<Integer> map=new HashSet<>();
	    for (int i = 0; i < N; i++) {
	      
	            map.add(A[i]);
	        
	    }
	    return map.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int remove_duplicate(int A[], int N) {
		  //import java.util.ArrayList;

		
		    if (N == 0 || N == 1) {
		        return N;
		    }

		    Arrays.sort(A); // Sort the array in ascending order

		    int index = 1; // Index to track the next position for unique elements

		    for (int i = 1; i < N; i++) {
		        if (A[i] != A[i - 1]) {
		            A[index++] = A[i];
		        }
		    }

		    return index;
		}


	
}
