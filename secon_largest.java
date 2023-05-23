import java.util.Arrays;

public class secon_largest {
	static  int print2largest(int arr[], int n) {
	        // code here
	       if(n<2
	       )return -1;
	       int max=-1;
	       //sorting 
	       Arrays.sort(arr);
				for(int i=n-2; i>=0; i--){
		            if(arr[i]!=arr[n-1]){
		                
		               max = arr[i];
		                break;
		                
		            }else{
		                
		                //If all values are same output a negative value
		                max = (-1);
		            }
			}
			return max;
			
	        
	    }
	public static void main(String[] args) {
		int as[]={2,4,2,44,5,3};
		System.out.println(print2largest(as,6));
	}

}
