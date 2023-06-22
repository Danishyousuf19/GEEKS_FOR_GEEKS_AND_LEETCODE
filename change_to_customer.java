import java.math.BigInteger;

public class change_to_customer {
	static boolean lemonadeChange(int N, int bills[]) {
		int f=0;int t=0;
		for(int i=0;i<N;i++) {
			if(bills[i]==5)
		{
			f++;
			
		}
			else if(bills[i]==10) {
				t++;
				if(f>=1) {
					f--;
				}
				else {
					return false;
				}
			}
			
			else {
				if(t>=1&f>=1) {
					t--;f--;
				}
				else if(f>=3) {
					f-=3;
				}
				else {
					return false;
				}
				
				
			}
			}
		return true;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
