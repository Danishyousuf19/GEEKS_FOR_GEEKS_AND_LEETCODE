import java.util.Arrays;

public class product_of_max_of_one_min_of_two {
	  long find_multiplication(int a[], int b[], int n, int m)
	    {long mult=1;
	       Arrays.sort(a);
	       Arrays.sort(b);mult= a[n-1]*b[0];
	       return mult;
	    		  
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
