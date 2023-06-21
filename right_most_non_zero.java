
public class right_most_non_zero {
	static int rightmostNonZeroDigit(int N, int[] A){
       int res=-1;
       long m=1;
       for(int e:A) {
    	   m*=e;
       }
//       StringBuilder s=new StringBuilder
       String s=Long.toString(m);
      s= s.replaceAll("0","");
       for(int i=s.length()-1;i>=0;i--) {
    	   
    	   
    	 System.out.println(s.charAt(i)-'0');
    		   return s.charAt(i)-'0';
    	   
       }
       return res;
    }
	public static void main (String []a) {
		int arr[]= {65,10};
	System.out.println(rightmostNonZeroDigit(1,arr));
		String s="232300";
		System.out.println(s.replaceAll("0",""));
	}
}
