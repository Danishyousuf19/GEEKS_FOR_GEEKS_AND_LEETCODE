
public class minimum_deletion {

	 static int minimumNumberOfDeletions(String S) {
	        //your code here
		 StringBuilder sb=new StringBuilder(S);
		 sb.reverse();
		 int n=S.length();
		 int s=longest_common_subSequence.lcs(n,n,S ,sb.toString());
		 return n-s;
	    }
	}