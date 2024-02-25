
public class sum_of_3_5_10 {
	 public long count(int n) {
	        // Add your code here.
	        long c=0,r=0;
	        for(int i=0;i<=n/3;i++){
	            r=n-i*3;
	            if(r%5!=0)continue;
	            c+=(r/10)+1;
	        }
	        return c;
	    }
}
