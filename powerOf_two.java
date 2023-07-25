
public class powerOf_two {
static boolean power(int n) {
	if(n<=0)
		return false;
	return (n&(n-1))==0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
