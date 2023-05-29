import java.util.ArrayList;
import java.util.Arrays;

public class Java1d2dArray {

	public static ArrayList<Integer> array(int a[][], int b[], int n)
    {int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i][i];
		}
		Arrays.sort(b);
		
		int max=b[b.length-1];
		
        ArrayList<Integer>list=new ArrayList<>();
        list.add(sum);
        list.add(max);
        return list;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
