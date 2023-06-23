
public class find_equilibrum {
	 public static int findEquilibrium(int arr[], int n)
     {
       int l=0;
       int r=n-1;
       int s1=arr[l];
       int s2=arr[r];
       while( l<r-1)
       {
    	   if(s2>s1) {
    		   
    		   l++;
    		   s1+=arr[l];
    	   }
    	   else if(s2<s1) {
    		   r--;
    		   s2+=arr[r];
    	   }
    	   else {
    		   l++;
    		   r--;
    		   s1+=arr[l];
    		   s2+=arr[r];
    	   }
       }
       if(s1==s2&l==r) {
    	   return l;
       }
       return -1;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
