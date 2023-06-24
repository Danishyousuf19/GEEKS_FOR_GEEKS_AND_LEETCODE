
public class no_of_bits {
	static int setBits(int N) {
        // code here
		int bits=0;
		while(N>0) {
			if(N%2==1) {
				bits++;
			}
			N/=2;
		}
		return bits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
