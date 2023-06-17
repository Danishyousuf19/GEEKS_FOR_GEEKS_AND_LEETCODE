
public class sum_of_prime {
	
		static boolean chk(int num)
		{
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}
				
			}
			return true;}
			static int[] getPrimes(int N) {
			       int[] arr=new int[2];
			       arr[0]=-1;
			       arr[1]=-1;
			       for(int i=2;i<=N/2;i++) {
			    	   int a=i;
			    	   int b=N-i;
			    	   if(chk(a)&chk(b)&(a+b==N)) {
			    		   arr[0]=a;
			    		   arr[1]=b; return arr;
			    	   }
			       }
			      return arr;
			                        
			    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
