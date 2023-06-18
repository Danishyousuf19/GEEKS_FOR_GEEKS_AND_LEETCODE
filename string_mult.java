import java.math.BigInteger;

public class string_mult {
	public String multiplyStrings(String s1,String s2)
    {
       BigInteger a=new BigInteger(s1) ;
       BigInteger b=new BigInteger(s2);
       BigInteger c=a.multiply(b);
       return c.toString();
    		   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
