
public class smith_no {
	 static int smithNum(int n) {
	        // code here
	        int sum=0,k=n,temp=digsum(n);
	        for(int i=2;i*i<=n;i++){
	            while(n%i==0){
	                sum+=digsum(i);
	                n/=i;
	            }
	        }
	        if(n>1&&n!=k)
	        sum+=digsum(n);
	        return sum==temp?1:0;
	    }
	    static int digsum(int n){
	        int t=n,s=0;
	        while(t!=0){
	            s+=t%10;
	            t/=10;
	        }
	        return s;
	    }
}
