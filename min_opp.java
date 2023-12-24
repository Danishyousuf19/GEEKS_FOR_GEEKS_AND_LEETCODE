
public class min_opp {
	 public int minOperations(String s) {
	        int n=s.length();
	        int opp=0;
	        for(int i=0;i<n;i++){
	            if(s.charAt(i)-'0'!=i%2)opp++;
	        }
	        return Math.min(opp,n-opp);
	    }
}
