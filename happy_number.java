
public class happy_number {
	static int isHappy(int N) { 
		
		if(N==1|N==7) {
			return 1;
		}
		int sum=N;
		
		while(sum>9)
		{ int current=sum;
			sum=0;
			
			while(current>0) {
				int d=current%10;
				sum=sum+d*d;
				current=10;
			}
			if(sum==1|sum==7)
				return 1;
		}
      return 0;
    		  
    }
	static int rec_is_happy(int n) {
		if(n==1||n==7) 
			return 1;
		if(n<10)
			return 0;
		int sum=0;
		int current =n;
		while(current>0) {
			sum=sum+((current%10)*(current%10));
			current/=10;
			
		}
		return rec_is_happy(sum);
	}
	public static void main(String[] args) {
	System.out.println(rec_is_happy(19));

	}

}
