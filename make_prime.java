
public class make_prime {
	class Solutivon
	{
	    public int minNumber(int arr[], int N)
	    {
	int sum=0;
	for(int e:arr){
	    sum+=e;
	}
	if(isp(sum))return 0;
	int c=1;
	sum++;
	while(!isp(sum)){
	    sum++;
	    c++;
	}
	return c;
	    }
	    boolean isp(int n){
	        if(n==0)return false;
	        if(n==2||n==3)return true;
	        if(n%2==0||n%3==0)return false;
	        for(int i=5;i*i<=n;i+=6){
	            if(n%i==0||n%(i+2)==0)return false;
	        }
	        return true;
	    }
	}
}
