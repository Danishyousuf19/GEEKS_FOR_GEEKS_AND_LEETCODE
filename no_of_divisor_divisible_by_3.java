
public class no_of_divisor_divisible_by_3 {
	static long count_divisors(int N){
        int c=0;
      
    	  for(int i=3;i<=N;i=i+3){
              if(N%i==0)
              {          
                      c++;        
      }
    	  }
    	  return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count_divisors(6));
	}

}
