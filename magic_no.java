
public class magic_no {
	 static long nthMagicNo(int n){
		 int ans=0;
		 int base=5;
		 while(n>0) {
			 int last=n&1;
			 n=n>>1;
			 ans+=base*last;
			 base*=5;
			 
		 }
		 return ans;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
