
public class sum_of_number_in_string {
	 public static long findSum_digitwise(String str)
	    {
	        long sum=0;
	        for(int i=0;i<str.length();i++) {
	        	char c=str.charAt(i);
	        	if(Character.isDigit(c)) {
	        		sum=sum+(c-48);
	        	}
	        	}return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findSum("23hg43oo"));
	}
	 //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
    	long sum=0;
    	int i=0;
    	while(i<str.length()) {
    		String s="";
    	while (i<str.length()&isnumber(str.charAt(i))) {
    		s=s+str.charAt(i);
    		i++;
    	}	
    	if(s.length()>0) {
    		sum=sum+Integer.parseInt(s);
    	}i++;
    	}
    	return sum;
    }
    static boolean isnumber(char c) {
    	
    		return (c<='9'&c>='0');
    	
    }
}
