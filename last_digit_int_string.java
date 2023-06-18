
public class last_digit_int_string {
	static  int isSame(String s) {
	      int c=0;int ans=0;
	      for(int i=0;i<s.length();i++) {
	    	  if(Character.isAlphabetic(s.charAt(i))) {
	    		  c++;
	    	  }
	    	  else {
	    		  ans=ans*10+(s.charAt(i)-'0');
	    	  }
	      }
//	      System.out.println(c+"  c    ans  "+ans);
	      if(ans==c) {
	    	  return 1;
	      }
	      return 0;
	      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isSame("geeks5"));
	}

}
