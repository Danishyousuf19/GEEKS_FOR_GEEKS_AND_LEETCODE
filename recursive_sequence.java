
public class recursive_sequence {
    static long sequence(int n) {
        long MOD = 1000000007;
        long res = 0;
    
        long k = 1;
        for (int i = 1; i <= n; i++) {
            long prod = 1;
            for (int j = 1; j <= i; j++) {
                prod = (prod * k) % MOD;
                k = (k + 1) % MOD;
            }
        res = (res + prod) % MOD;
        }
    return res;
   }

}