
public class kandans_algo {
	public static long optimal(long[] a, int n, int t) {
        long maxi = Long.MIN_VALUE;
        long s = 0;
        int j = 0;
        long frontSum = 0;

        for (int i = 0; i < n; i++) {
            s += a[i];

            if (i - j + 1 == t) {
                maxi = Math.max(maxi, s);
            }
            if (i - j + 1 > t) {
                frontSum = frontSum + a[j];
                j++;

                if (frontSum < 0) {
                    s = s - frontSum;
                    frontSum = 0;
                }
                maxi = Math.max(s, maxi);
            }
        }

        return maxi;
    }

}
