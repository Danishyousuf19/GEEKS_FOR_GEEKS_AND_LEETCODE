//Given two integers A and B. Find the smallest number X (greater than A) which is divisible by B.
public class Divisible_Numbers {
	 static long find(long A,long B){  
	        for(long i=(A+1);i>A;i++) {
	        	if(i%B==0) {
	        		return i;
	        	}
	        }return -1;
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkPower(73));
	}
	static int checkPower(int N){
       double x=Math.cbrt(N);
       System.out.println(x);
       int n=(int) Math.floor(x) ;
       System.out.println(n);
       if(n*n*n==N){
    	
    	   return 1;
       }
       return 0;
    }
}
