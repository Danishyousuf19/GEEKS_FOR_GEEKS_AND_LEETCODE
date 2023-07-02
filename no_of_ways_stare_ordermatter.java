
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

}
