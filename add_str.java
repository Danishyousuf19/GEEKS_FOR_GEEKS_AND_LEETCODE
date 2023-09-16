import java.math.BigInteger;

public class add_str {
	 public String addStrings1(String num1, String num2) {
		 BigInteger a= new BigInteger(num1);
		 BigInteger b= new BigInteger(num2);
		 BigInteger c=a.add(b);
		 return c.toString();
	 }
	 public String addStrings(String num1, String num2) {
		    StringBuilder result = new StringBuilder();
		    int carry = 0;
		    int i = num1.length() - 1;
		    int j = num2.length() - 1;

		    while (i >= 0 || j >= 0 || carry > 0) {
		        int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
		        int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
		        int sum = digit1 + digit2 + carry;
		        carry = sum / 10;
		        int digitSum = sum % 10;
		        result.insert(0, digitSum);
		    }

		    return result.toString();
		}

}
