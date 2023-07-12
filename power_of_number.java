
public class power_of_number {
//	0(R)
	static  long powerr(int N,int R)
	    {
		 if(R==0)
			 return 1;
		
		 return (N%1000000007*powerr(N,--R)%1000000007)%1000000007;
		
	    }

	public static void main(String[] args) {
//		System.out.println(power(12,21));

	}

    long power(int N,int R)
{
   if(N==0)
   return 0;
if(R==0)
	 return 1;
if(R%2==0) {
	 long ans=power(N,R/2);
	 return (ans%1000000007*ans%1000000007)%1000000007;
}
else {
long ans =power(N,(R-1)/2);
return (ans%1000000007*ans%1000000007*N%1000000007)%1000000007;
}
}
}
