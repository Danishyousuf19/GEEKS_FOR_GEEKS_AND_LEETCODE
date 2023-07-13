
public class how_many_number_of_words_required_to_make_palendrom {
	 public static int minChar(String str) {
		 int end=str.length()-1;
	       while(end>=0) {
	    	   if(ispal(str,end)) {
	    		   return str.length()-1-end;
	    	   }
	    	   end--;
	       }
	       return -1;
	    }
	 public static boolean ispal(String s,int j) {
		 int i=0;
		 while(i<j) {
			 if(s.charAt(i)!=s.charAt(j))
				 return false;
			 i++;
			 j--;
		 }
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int minChar2(String st) {
		 int n=st.length();
		 int e=st.length()-1;
	     int s=0;
	     int r=0;
	     while(s<=e){
	         if(st.charAt(s)==st.charAt(e))
	         {
	             s++;
	             e--;
	         }
	         else{
	             r++;
	             s=0;
	             e=n-r-1;
	         }
	     }
		 return r;
	 }

}
