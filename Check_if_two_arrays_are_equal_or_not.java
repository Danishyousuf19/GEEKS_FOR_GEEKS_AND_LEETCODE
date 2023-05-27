import java.util.Arrays;

public class Check_if_two_arrays_are_equal_or_not {

	public static boolean check(long A[],long B[],int N)
    {
       Arrays.sort(A);
       Arrays.sort(B);
//       for (int i=0;i<N;i++) {
//    	   if(A[i]!=B[i]) {
//    		   return false;
//    	   }
//       }
       return Arrays.equals(A,B) ;
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
