import java.util.Arrays;

public class index_of_extra {
	  public int findExtra(int a[], int b[], int n) {
		
	      for(int i=0;i<=n;i++) {
 
	    		  if(a[i]!=b[i]) {
	    			return i;
	    		  }
	      }
	    return -1;   
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
