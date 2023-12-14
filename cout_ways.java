
public class cout_ways {
	long countWays(int n,int k)
    {
        //code here.
        long same=0;
        long diff=k;
        long mod = (long) Math.pow(10,9)+7;
        for(int i=2;i<=n;i++){
            long prev=same;
            same=diff;
            diff=(same+prev)*(k-1)%mod;
        }
        return (same+diff)%mod;
    }

}
