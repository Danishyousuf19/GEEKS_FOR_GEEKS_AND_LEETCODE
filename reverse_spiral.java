
public class reverse_spiral {
	 public int[] reverseSpiral(int r, int c, int[][] a)
	    {
	       int arr[]=new int[r*c];
	       int j=r*c-1;
	       int rl=0,cl=0,cu=c-1,ru=r-1;
	       while(rl<=ru&&cl<=cu) {
	    	   for(int i=cl;i<=cu;i++) {
	    		   arr[j--]=a[rl][i];
	    	   }
	    	   rl++;
	    	   for(int i=rl;i<=ru;i++) {
	    		   arr[j--]=a[i][cu];
	    	   }
	    	   cu--;
	    	   if(rl<=ru) {
	    	   for(int i=cu;i>=cl;i--) {
	    		   arr[j--]=a[ru][i];
	    	   }
	    	   ru--;}
	    	   if(cl<=cu) {
	    	   for(int i=ru;i>=rl;i--) {
	    		   arr[j--]=a[i][cl];
	    	   }
	    	   cl++;}
	    	   
	       }
	       return arr;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
