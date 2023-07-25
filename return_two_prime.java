import java.util.*;

public class return_two_prime {
	 static List<Integer> primeDivision(int N){
	        ArrayList <Integer>a=new ArrayList<>();
	     
	        for(int i=1;i<=N;i++) {
	        	if(isprime(i)&isprime(N-i)) {
	        		a.add(i);
	        		a.add(N-i);
	        	}
	        } 
	        return a;
	    }
	 static boolean isprime(int a) {
		 if(a<2) 
			 return false;
		 
		 for(int i=2;i<=Math.sqrt(a);i++) {
			 if(a%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
