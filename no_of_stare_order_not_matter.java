
public class no_of_stare_order_not_matter {
	public long nthStair(int n)
    {
		long d[]=new long[n+1];
		d[0]=1;
		d[1]=1;
		for(int i=2;i<=n;i++) {
			d[i]=d[i-2]+d[i-1];
		}
		return d[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public long nthStair1(int n)
	    {
	        if(n<=1)return 1;
	        return nthStair1(n-2)+1;
	    }
}
