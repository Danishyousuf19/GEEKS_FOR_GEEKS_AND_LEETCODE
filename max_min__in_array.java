import java.util.Arrays;

//User function Template for Java


 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
    static   pair getMinMax(long a[], long n)  
    {
	  Arrays.sort(a);
	  return new pair(a[0],a[a.length-1]);
        //Write your code here
    }
} 


public class max_min__in_array {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
