import java.util.ArrayList;

public class prime_in_range {
	static boolean chk(int num)
	{
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	static  ArrayList<Integer> primeRange(int M, int N) {
	      ArrayList <Integer>a=new ArrayList<>();
	      for(int i=M;i<=N;i++) {
	    	  if(i<2) {
	    		  continue;
	    	  }
	    	  if(chk(i)) { a.add(i);
	    		 
	    	  }
	      }
	      return a;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer>a=primeRange(1,10);
for(int E:a) {
	System.out.println(E);
}
	}

}
