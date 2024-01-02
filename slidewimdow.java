
public class slidewimdow {
	public long maxSumWithK(long a[], long n, long t)
    {
     
        long frontSum = 0, currSum = 0;
        int j = 0;

        for (int i = 0; i < t; i++) {
            currSum += a[i];
        }

        long maxi = currSum;

        for (int i = (int) t; i < n; i++) {
            currSum += a[i];
            frontSum += a[j];
            j++;

            if (frontSum < 0) {
                currSum = currSum - frontSum;
                frontSum = 0;
            }

            maxi = Math.max(maxi, currSum);
        }
     return maxi;
    }
}
