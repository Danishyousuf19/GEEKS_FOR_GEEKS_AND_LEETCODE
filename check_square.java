//Given an integer N, check if it is possible
//to represent it as a function(a, b) such tha
//t : a2 + b2 = N where "a" and "b" are whole numbers. Print 1 if it's possible, else Print 0.
public class check_square {
	 static int checkSquares(int N) {
	        // code here
		 
		 for (int i=0;i<=N;i++) {
			 for (int j=0;j<=N;j++) {
				 int x=(int) Math.pow(i, 2);
				 int y=(int) Math.pow(j, 2);
				 if(x+y==N)return 1;
			 }
		 }return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static long isPerfectSquare(long n){
	       long g=(long) Math.sqrt(n);
	       if(g*g!=n) {
	    	   return 0;
	       }return 1;
	    }
	// Check square
}
