
public class product_even_or_odd {

    static int EvenOdd(String n1 , String n2)
        {int x=n1.length()-1;
        int y=n2.length()-1;
            int n=n1.charAt(x)-48;
            int m=n2.charAt(y)-48;
            return ((n*m%2==0)?1:0);
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=EvenOdd("2323","23");
System.out.println(x);
	}

}
