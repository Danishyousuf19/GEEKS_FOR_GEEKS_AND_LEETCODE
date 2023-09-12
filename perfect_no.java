
public class perfect_no {
	static int isPerfectNumber(long N) {
	    if(N<=1)return 0;
			long sum=1;
			for(long i=2;i*i<=N;i++) {
				if(N%i==0) {
					sum=sum+i;
					if(N%i!=i){
					    sum=sum+N/i;
					}
				}
			}
	        return sum==N?1:0;
	    }
}
