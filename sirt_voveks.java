import java.util.Arrays;

public class sirt_voveks {
	 public String sortVowels(String s) {
	        StringBuilder sb=new StringBuilder();
	        StringBuilder v= new StringBuilder();
	        StringBuilder co = new StringBuilder();
	        for(char c:s.toCharArray()) {
	        	if(isvov(c))v.append(c);
	        	else co.append(c);
	        }
	        char[] sv = v.toString().toCharArray();
	        Arrays.sort(sv);
	        int i=0;int j=0;
	        for(char c:s.toCharArray()) {
	        	if(isvov(c))sb.append(sv[i++]);
	        	else sb.append(co.charAt(j++));
	        }
	        return sb.toString();
	    }
	 

	private boolean isvov(char c) {
		// TODO Auto-generated method stub
		return "aeiouAEIOU".indexOf(c)!=-1;
	}
}
