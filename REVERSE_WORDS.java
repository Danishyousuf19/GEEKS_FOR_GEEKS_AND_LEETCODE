
public class REVERSE_WORDS {
	 String reverseWords(String S)
	    {String d="";
	        String a[]=S.split(".");
	        for(int i=a.length-1;i>=0;i--) {
	        	d=d+"."+a[i];
	        }
	    
	        return d;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="ddsda. adas dwq.dasd";
		 String a[]=S.split("\\.");
		 
		 for(int i=a.length-1;i>=0;i--) {
		 System.out.println(a[i]);
		 }
	}

}
