
public class count_str {
	long  countStr( long  n){
	    long ans = 0;
	    // b = 0 and c = 0;
	    ans += 1;
	    // b = 0 and c = 1;
	    ans += n;
	    // b = 0 and c = 2;
	    if(n >= 2) ans += (n*(n-1))/2;
	    
	    // b = 1 and c = 0
	    ans += n;
	    // b = 1 and c = 1;
	    if(n >= 2) ans += n*(n-1);
	    // b = 1 and c = 2;
	    if(n >= 3) ans += (n*(n-1)*(n-2))/2;

	    return ans;
	}
}
