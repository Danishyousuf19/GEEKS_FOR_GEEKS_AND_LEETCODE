
public class Remove_consonants_string {
	 public String removeConsonants(String s)
	 {
		 String n="aeiouAEIOU";
		 String x="";		 
	        for (int i=0;i<s.length();i++) {
	        	char c=s.charAt(i);
	        	for (int j=0;j<10;j++) {
	        		char v=n.charAt(j);
	        		if(v==c) {
	        			x=x+v;
	        		}
	        	}	
	        }
	        if(x.length()>0)
	        return x;
	        return "No Vowel";
	    
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}}
