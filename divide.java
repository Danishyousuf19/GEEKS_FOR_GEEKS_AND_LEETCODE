
public class divide {
	 public int divide(int n, int d) {
	        if(n==1<<31&&d==-1)return (1<<31)-1;
	        boolean neg=n<0^d<0;
	        n=Math.abs(n);
	        d=Math.abs(d);
	        int q=0;
	        while(n-d>=0) {
	        	int currd=d;
	        	int currq=1;
	        	while(n-(currd<<1)>=0) {
	        		currd=currd<<1;
	        		currq=currq<<1;
	        	}
	        	q+=currq;
	        	n-=currd;
	        }
			return neg?-q:q;
	    }
}
