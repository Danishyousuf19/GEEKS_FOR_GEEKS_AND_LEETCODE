
public class pattern_reprat_2211$21 {
	static void printPat(int n)
    {
         for (int i=n;i>=1;i--) {
        	 for(int j=n;j>=1;j--) {
        		 for(int k=0;k<i;k++) {
        			 System.out.print(j+" ");
        		 }
        	 }System.out.print("$");
         }
    }
//	 public static int product(int arr[],int n)
//	    {
//	        int m=1;
//	        for(int i=0;i<n;i++){
//	            m*=arr[i];
//	        }
//	        return m;
//	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printPat(2);
//int x[]={1,2,3,4,5};
//System.out.println(product(x,5));

	}

}
//3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $