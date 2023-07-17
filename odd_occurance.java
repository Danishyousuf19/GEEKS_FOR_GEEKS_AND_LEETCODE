
public class odd_occurance {
	public int[] twoOddNum(int arr[], int N)
    {
        int a[]= {0,0};  
        int xor=0;
        for(int i:arr) {
        	xor^=i;
        }//by upper loop we will get XOR of 2 odd number
        
        int setedbit=0;//Initialize the bit which can have same first bit
//        we are dividing array into two so that one (odd)with same first bit is one answer and other is 2nd answer
         for(int i=0;i<32;i++) {
        	 int current =1<<i;
        	 if((current&xor)!=0) {
        		 setedbit=current;//knowing the first bit of xor;
        		 break;
        	 }
         }
         for(int i=0;i<N;i++) {
        	 if((setedbit&arr[i])!=0)
        	 {
        		 a[0]^=arr[i];//dividing array on the behalf of the presence of first set bit 
        	 }
        	 else {
        		 a[1]^=arr[i];//dividing array on the behalf of the absence of first set bit 
        	 }
         }
         if(a[0]>a[1])//arranging in increasing order
        return a;
         else {
        	 int temp=a[0];
        	 a[0]=a[1];
        	 a[1]=temp;}
         return a;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
