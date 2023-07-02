
public class set_all_bit {
	 static int setAllRangeBits(int x , int l , int r) {
		  for(int i=l;i<=r;i++) {
				x|=1<<(i-1);
			}
		        return x ;
		    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	long findBitwiseOR_rec(long L,long R) {
	      if(L==R)  return L;
	     return (L|=  findBitwiseOR_rec(L+1, R));
	      
	    }
	long findBitwiseOR(long L,long R) {
	      while(L<R){
	          L=L|(L+1);
	      }
	      return R|L;
	    }
}
