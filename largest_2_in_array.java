import java.util.Arrays;

//You don't need to read input or print anything. Your task is to complete the 
//function findElements() which takes the array A[] and its size N as inputs 
//and return the vector sorted values denoting the elements in array which have 
//		at-least two greater elements than themselves.

public class largest_2_in_array {
	 public static long[] findElements( long a[], long n)
	    {
		 long f[]=new long[(int) (n-2)];
	       Arrays.sort(a);
	       for(int i=0;i<n-2;i++) {
	    	  f[i]=a[i];
	       }
	       return f;
	    		   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EXAMPLE");
		long a[]= {1,2,3,4,-64,-6,44,32,0};
		long f[]=findElements(a, 9);
		System.out.println(Arrays.toString(f));

	}

}
//EXAMPLE
//[-64, -6, 0, 1, 2, 3, 4]