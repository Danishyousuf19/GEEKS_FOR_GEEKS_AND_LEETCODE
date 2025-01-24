
public class Find_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		int b=32;
		int p=0;
		int m=1;
		while(b>0) {
			int deg=b%10;
			p+=deg*m*a;
			m*=10;
			b/=10;
		}
		System.out.println(p);
	}

}
