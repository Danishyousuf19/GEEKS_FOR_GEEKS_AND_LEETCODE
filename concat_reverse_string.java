//You dont need to read input or print anything. Complete the f
//unction conRevstr() which
//takes S1 and S2 as input parameter and returns the sting
//final_s after concatenating and reversing.
public class concat_reverse_string {
    static String reverse(String a,String b ,int idx) {
    	if(idx<0) {
    		return b;
    	}
    	char current=a.charAt(idx);
    		 return  reverse(a,b+current,idx-1);
    
    }
	 static String conRevstr(String S1, String S2) {
	       String s=S1.concat(S2);
	       int len=s.length()-1;
	       return reverse(s,"",len);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(conRevstr("danis","your"));
	}

}
