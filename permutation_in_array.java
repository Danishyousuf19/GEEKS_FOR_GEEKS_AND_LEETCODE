import java.util.Arrays;

//Given two arrays of equal size N and an integer K. The task is to check 
//if after permuting both arrays, we get sum of their corresponding element 
//greater than or equal to k i.e Ai + Bi >= K for all i (from 0 to N-1)
//. Return true if possible, else false.

public class permutation_in_array {

	public static long []reverse(long b[]){
		int l=b.length;
		long B[]=new long[l];
		for(int i=0,j=(l-1);i<l&j>=0;i++,j--) {
			B[i]=b[j];
		}
		return B;
	}
	 public static boolean isPossible(long a[], long b[], int n, long k) {
		 Arrays.sort(a);
		long[] B= reverse(b);
		for (int i=0;i<n;i++) {
			if(a[i]+B[i]<k) {
				return false;
			}
		}
	       return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
