import java.util.HashSet;

public class smallest_missing_On {

	static int missingNumber(int arr[], int n)
    {
        boolean res[]=new boolean [n+1];
        for(int i=0;i<n;i++) {
        	if(arr[i]>0&&arr[i]<=n) {
        		res[arr[i]]=true;
        	}
        }
        for(int i=1;i<n;i++) {
        	if(!res[i]) {
        		return i;
        	}
        }
        return n+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
