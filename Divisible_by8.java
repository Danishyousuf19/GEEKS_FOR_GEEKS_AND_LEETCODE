
public class Divisible_by8 {
	static  int isDivisible8(String S){
		int n=S.length();
		if(n>3) {
		S=S.substring(n-3,n);	
		}
		int x=Integer.parseInt(S);
		if(x%8==0) {
			return 1;
	
		}
	     return 0;  
	    }

	public static void main(String[] args) {
		String s="2673814";
		System.out.println(isDivisible8(s));
			}
}
