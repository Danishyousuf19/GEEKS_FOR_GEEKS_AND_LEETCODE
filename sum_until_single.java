
public class sum_until_single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=173;
		
		int s=a;
		while(s>9) {
			int c=0;
			while(s>0) {
				c+=(s%10);
				s/=10;
			}
			s=c;
		}
		System.out.println(s);
	}

}
