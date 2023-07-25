import java.util.ArrayList;

public class kth_fator {
	static int kThSmallestFactor(int N , int K) {
	      // code here
	       for(int i=1;i<=N;i++) {
	    	  if(N%i==0&&--K==0)return i;
	      }
	       return -1;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(kThSmallestFactor(821000,31));
	}

}
