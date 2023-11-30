
public class min_path {
	 public int minStep(int n)
	    {
	        // code here
	        return help(n);
	    }
	    int help(int n){
	        if(n==1||n==0)return 0;
	        else if(n==2)return 1;
	        else if(n%3==0)return 1+help(n/3);
	        else if((n-1)%3==0)return 2+help((n-1)/3);
	        else  return 3+help((n-2)/3);
	    }
}
