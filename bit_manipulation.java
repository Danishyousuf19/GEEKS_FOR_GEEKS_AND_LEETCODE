
public class bit_manipulation {
	 static void bitManipulation(int num, int i) {
		 System.out.print(get(num,i)+" " ); 
		 System.out.print(set(num,i)+" "); 
		 System.out.print(clear(num,i)+" "); 
	    }
	 static int get(int n,int i) {
		 int bitmask=1<<i;
		 return n&bitmask;
		 
	 }
static int set(int n,int i) {
	 int bitmask=1<<i;
	 return n|bitmask;
	 }

static int clear(int n,int i) {
	 int bitmask=1<<i;
	 bitmask=~bitmask;
	 return n&bitmask;
	 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
