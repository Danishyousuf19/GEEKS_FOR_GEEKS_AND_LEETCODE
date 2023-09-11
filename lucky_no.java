
public class lucky_no {
	public static boolean isLucky(int n)
    {int i=2;
    while(n>=i) {
    	if(n%i==0)return false;
    	n=n-n/i++;
    	
    }
    return true;
        // Your code here
    }
}
