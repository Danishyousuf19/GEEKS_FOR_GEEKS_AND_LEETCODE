
public class even_factor_sum {
	static int evenFactors(int N) 
    { 
        int sum=0;
        for(int i=2;i<=N;i=i+2) {
        	if(N%i==0) {
        		sum+=i;
        	}
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
