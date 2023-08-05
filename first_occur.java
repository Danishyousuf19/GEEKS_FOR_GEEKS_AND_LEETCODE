
public class first_occur {
	
		 public int strStr(String h, String n) {
	         for(int i=0;i<=h.length()-n.length();i++){

		          if(h.substring(i,i+n.length()).equals(n))return i;
		        }
				return -1;
	    }
}
