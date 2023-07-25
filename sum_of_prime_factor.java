
public class sum_of_prime_factor {
	public long Sum(long n, long a, long b)
    {
        long c=0;
        for(long i=a;a<=b;i++) {
        	c+=findfactor(i);
        }
        
        return c;
    }
	static long findfactor(long n ){
		long c=0;
		if(n<2)return 0;
		while(n%2==0) {
			c++;
			n/=2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			while(n%i==0) {
				c++;
				n/=i;
			}
		}
		if(n>2)c++;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
