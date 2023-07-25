
public class no_of_ways_stare_ordermatter {
//	order does matter
	public long nthStair1(int n)
    {
		if(n<=1)
			return 1;
		return nthStair1(n-2)+nthStair1(n-1);
		
    }
//	order does not matter
	public long nthStair(int n)
    {if(n<=1)
    	return 1;
    else if(n==2)
    	return 2;
    return nthStair(n-1)+nthStair(n-2);
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method st
		
	}
	 int countWays(int n)
	    {
	       		int d[]=new int[n+1];
			d[0]=1;
			d[1]=1;
			for(int i=2;i<n+1;i++) {
			 d[i]=(d[i-1]%1000000007)+(d[i-2]%1000000007);
			}
			return d[n]%1000000007;
	        
	        // your code here
	    }

}
