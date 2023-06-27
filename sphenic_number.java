
public class sphenic_number {
	public int isSphenicNo(int N)
    {
		int m=1;
		int c=0;
		for(int i=2;i<=N/2;i++) {
			if(isprime(i)) {
				if(N%i==0) {
					c++;
					m*=i;
				}
			
			}
		}
		if(m==N&&c==3)
			return 1;
       return 0;
    }
	static boolean isprime(int a) {
		
		 for(int i=2;i<=Math.sqrt(a);i++) {
			 if(a%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
