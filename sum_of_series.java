
public class sum_of_series {
	public static void main(String[] args) {
        int n = 5; // Change this value to compute the sum for different n
        int sum = computeSeriesSum(n);
        System.out.println("Sum of the first " + n + " terms: " + sum);
    }

	private static int computeSeriesSum(int n) {
		// TODO Auto-generated method stub
		int s=0;
		int t=1;
		int c=0,i=1;
		while(c<n) {
			s=s+t*i;
			t*=-1;
			i+=2;
			c++;
		}
		return s;
	}
	
}
