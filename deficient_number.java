
public class deficient_number {
	static String isDeficient(long x){
		int m=0;
        for(int i=2;i<=Math.sqrt(x);i++) {
        	if(x%i==0) {
        		m+=i;
        		if((x/i) != i){
                    m += (x/i);
                }
        	}
        }
        return (m<2*x)?"YES":"NO";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
