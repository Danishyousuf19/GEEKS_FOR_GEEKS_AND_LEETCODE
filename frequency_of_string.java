
public class frequency_of_string {
	 public static String maximumFrequency (String S) {
	        int f=1;
	        String a[]=S.split(" ");
	        String s=a[0];
	        for(int i =0;i<a.length;i++) {
	        	int m=0;
	        	String c=a[i];
	        	for(int j=0;j<a.length;j++) {
	        		if(c.equals(a[j])) {
	        			m++;
	        		}
	        	}
	        	if(m>f) {
	        		f=m;
	        		s=c;
	        	}
	        }
	        return s+f;
	        
	    }
	 public static void main(String[] args) {
		 String s="danish is a good boy he is a danish ";
		 String g=maximumFrequency(s);
		 System.out.println(g);
	 }
	    
}
