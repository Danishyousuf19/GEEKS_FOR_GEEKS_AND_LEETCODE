
public class is_perfect_square_ASCII {
	 static int isSquare(String S)

	    {
		 int sum=0;
	     
	        for (int i=0;i<S.length();i++) {
	        	char c=S.charAt(i);
	        	sum+=c;
	        }
	        int d=(int) Math.sqrt(sum);
	      if(  d*d==sum)
	         return 1;
	      
	      else return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=(int) Math.sqrt(73);
System.out.println(d*d);
	}

}
