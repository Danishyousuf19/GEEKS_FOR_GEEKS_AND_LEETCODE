import java.util.*;

public class split_string {
	 static List<String> splitString(String S) 
	    { 
	      List<String> a=new LinkedList<String>();
	      String x="";
	      String y="";
	      String z="";
	      for(int i=0;i<S.length();i++) {
	    	  char c=S.charAt(i);
	    	  if(Character.isAlphabetic(c)) {
	    		  x+=c;
	    	  }
	    	  else if(Character.isDigit(c)) {
	    		  y+=c;
	    	  }
	    	  else {
	    		  z+=c;
	    	  }
	      }
	      a.add(x);
	      a.add(y);
	      a.add(z);
	      return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
