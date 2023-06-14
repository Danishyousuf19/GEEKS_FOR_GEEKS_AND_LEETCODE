
public class largest_number {
	static int find(int N){
		while(N>0) {
			if(non_dec(N)) {
				return N;
			}
			else {
				N=N-1;
			}
			
		}
		return N;
        
    }
	static boolean non_dec(int N) {
		        String s=Integer.toString(N);
		        for(int i=1;i<s.length();i++) {
		        	if(s.charAt(i)<s.charAt(i-1)) {
		        		return false;
		        	}
		        }
		        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
