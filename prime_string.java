
public class prime_string {
	static boolean isprime(int n) {
		if(n<2) {
			return false;}
			if(n==2|n==3|n==5) {
				return true;
			}
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0)return false;
			}
			return true;
		
	}
	public static boolean isPrimeString(String s)
    {int n=0;
    for(int i=0;i<s.length();i++) {
    	n+=(s.charAt(i));
    }
    System.out.println(n);
        return isprime(n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPrimeString("India"));
	}

}
