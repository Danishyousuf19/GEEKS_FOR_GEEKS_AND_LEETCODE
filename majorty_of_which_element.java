import java.util.Arrays;

public class majorty_of_which_element {
	static int majorityElement(int a[], int size)
    {
		Arrays.sort(a);
	int c=0;
       for(int i=0;i<size-1;i++) {
    	   if(a[i]==a[i+1]) {
    		   
    		   c++;
    	   } if(c>=(a.length/2)-1) {
    	   return a[i];
       }
       }
       if(a.length==1) {
    	   return a[0];
       }return -1;
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
