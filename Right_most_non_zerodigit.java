
public class Right_most_non_zerodigit {
	static int rightpastNonZeroDigit(int N, int[] A){
        // code here
		int s=1;
		for (int i=0;i<N;i++) {
			s*=A[i];
		}
		
		String n="";
		String d=Integer.toString(s);
		for (int i=d.length()-1;i>=0;i--) {
			char c=d.charAt(i);
			if(c=='0') {
				
				n=d.substring(0,i);
			}
		}
		String h=n.replaceAll("0", "");
		if(h.length()>0) {
			return h.length()+1;
		}
		else return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String d="230232";
if(d.contains("0")) {
	System.out.println("efw");
}
	}
	static int rightmostNonZeroDigit(int N, int[] A){
        // code here
		 int s=1;
			for (int i=0;i<N;i++) {
				s*=A[i];
			}
			if(s<10&s>=1){
			    return s;
			}
		
			String n="";
			String d=Integer.toString(s);
			if(!d.contains("[0]")) {
				n=n+d.charAt(N-1);
				int x=Integer.parseInt(n);
				return x;
			}
			for (int i=d.length()-1;i>=1;i--) {
				char c=d.charAt(i);
				if(c=='0') {
					n=n+d.charAt(i-1);
					int x=Integer.parseInt(n);
				return x;
				}
		
				
			}return -1;
			
		
    }
}
