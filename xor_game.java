
public class xor_game {
	 static int gameOfXor(int N , int[] A) {
	        // code here
	        if(N%2==0) return 0;
	        int c=A[0];
	        int i=2;
	        while(i<N){
	            c^=A[i];
	            i+=2;
	        }
	        return c;
	    }
}
