import java.util.ArrayList;
import java.util.Arrays;

public class fid_duplicate {
	public static ArrayList<Integer> duplicates(int arr[], int n) {
		ArrayList<Integer> a=new ArrayList<>();
		int f=0;
		Arrays.sort(arr);
		for(int i=1;i<n;i++) {
			if(arr[i-1]==arr[i]) {
				a.add(arr[i]);
				f++;
			}
		}
		if (f==0) {
			a.add(-1);
			return a;
		}
		
		return a;
		
		
        // code here
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
