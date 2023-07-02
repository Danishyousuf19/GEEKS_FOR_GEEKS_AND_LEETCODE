
public class copy_set_of_bits {
static int setSetBit(int x, int y, int l, int r){
	
	
	for(int i=l;i<=r;i++) {
		x|=y&1<<(i-1);
	}
        return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
