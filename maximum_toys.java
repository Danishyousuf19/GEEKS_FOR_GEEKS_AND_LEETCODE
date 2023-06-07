import java.util.Arrays;

public class maximum_toys {
	 static int toyCount(int N, int K, int arr[])
	    {int c=0;
	        Arrays.sort(arr);
	        for(int i=0;i<N;i++) {
	        	if(arr[i]<=K) {
	        		c++;
	        		K=K-arr[i];
	        	}
	        	else {
	        		break;
	        	}
	        }return c;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
