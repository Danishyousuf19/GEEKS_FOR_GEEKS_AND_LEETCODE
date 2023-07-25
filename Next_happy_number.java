
public class Next_happy_number {
	static int nextHappy(int N){
		int nxt=N+1;
		while(true) {
			if(chk(nxt)==1) {
				return nxt;
				
			}
			else {
				nxt++;
			}
			
		}
		
	}
	static int chk(int n) {
		if(n==1||n==7)return 1;
		int sum=n;
		int current=n;
		while(sum>9) {
			sum=0;
			while(current>0) {
				int d=current%10;
				sum+=d*d;
				current/=10;
				
			}
			sum=current;
			if(sum==1||sum==7)return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
