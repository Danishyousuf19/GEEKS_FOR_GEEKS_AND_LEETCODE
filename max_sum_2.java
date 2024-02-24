
public class max_sum_2 {
	 public int maxSum(int n) 
	    { 
	        //code here.
	        if(n<4){
	            return n;
	        }
	        
	        int a=maxSum(n/2)+maxSum(n/3)+maxSum(n/4);
	        if(a>n)return a;
	        return n;
	    }
}
