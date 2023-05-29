
public class is_prime_ASCII {
	 public boolean isPrimeString(String s)
     {int sum=0;
     
        for (int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        	sum+=c;
        }
        for (int i=2;i<=Math.sqrt(sum);i++) {
        	if(sum%i==0) {
        		return false;
        	}
        }
        return true;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
