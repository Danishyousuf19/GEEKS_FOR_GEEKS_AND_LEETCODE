
public class equitorai_point {
	public static int equilibriumPoint(long arr[], int n) {
		long sum = 0;
		for(long e:arr) {
			sum+=e;
		}
		long lsum=0;
		long rsum=sum;
		for(int i=0;i<n;i++) {
			rsum=rsum-arr[i];
			if(rsum==lsum) {
				return i+1;
			}
			lsum+=arr[i];
		}
		return -1;

	}
}
