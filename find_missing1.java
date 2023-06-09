
public class find_missing1 {
	int missingNumber(int array[], int n) {
        int x=0;
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n-1;i++) {
        	sum+=array[i];
        }
        x=sum-sum2;
        return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
