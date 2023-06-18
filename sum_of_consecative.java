
public class sum_of_consecative {
	static int getCount(int N) {
	       // code here
	       int ans = 0;
	       for (int i = 2; i * (i - 1) / 2 < N; ++i)
	           if ((N - i * (i - 1) / 2) % i == 0)
	               ans++;
	       return ans;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
