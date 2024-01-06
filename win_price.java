
public class win_price {
	public static long sumOfPowers(long a, long b) {
	    long c = 0l;
	    while(a <= b){
	        c += count(a);
	        a++;
	    }
	    return c;
	}

	static long count (long a){
	    int sum = 0;
	    while(a % 2 == 0){
	        sum += 1;
	        a /= 2;
	    }
	    long q = 3;
	    while(q * q <= a){
	        if(a % q == 0){
	            a /= q; 
	            sum += 1;
	        } else {
	            q += 2;
	        }
	    }
	    if(a > 1) sum += 1;
	    return sum;
	}

}
