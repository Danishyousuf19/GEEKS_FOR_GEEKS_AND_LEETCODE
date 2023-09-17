
public class add_binary {
	 public String addBinary(String a, String b) {
	       StringBuilder sb= new StringBuilder();
	       int c=0;
	       int i= a.length()-1;
	       int j=b.length()-1;
	       while(i>=0||j>=0||c>0) {
	    	   int d1=i>=0?a.charAt(i--)-'0':0;
	    	   int d2=j>=0?b.charAt(j--)-'0':0;
	    	   int sum=d1+d2+c;
	    	   c=sum/2;
	    	   int ds=sum%2;
	    	   sb.insert(0, ds);
	       }
	       return sb.toString();
	       
	    }
}
