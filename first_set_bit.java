
public class first_set_bit {
	 public static int getFirstSetBit(int n){
         int c=0;
     while(n>0)
     {
     if((n&1)!=0){
         return c+1;
     }
     n>>=1;
     c++;}
 return 0;
         
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getFirstSetBit(12));
	}

}
