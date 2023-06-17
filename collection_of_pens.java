
public class collection_of_pens {
	 public int minThirdPiles(int A, int B)
	    {int sum=A+B;
	       int prime=sum+1;
	       while(!chk(prime)) {
	    	   prime++;
	       }
	       return prime;
	    }
	 
	 static boolean chk(int num)
		{
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}
				
			}
			return true;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
