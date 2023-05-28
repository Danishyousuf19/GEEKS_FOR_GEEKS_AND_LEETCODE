
public class no_of_Square_in_Matrix {
	 static long squaresInMatrix(int m, int n) {
	        // code here
		 long sum=0;
		 while (m>0&n>0) {
			 int prod=m*n;
			 n--;
			 m--;
			 sum+=prod;
		 }
		 return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 
}
