
public class fibo {
	int[] Series(int n) {
        // code here
         int a[]= new int[n+1];
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=(a[i-1]+a[i-2])%1000_000_007;
        }
        return a;
    }
}