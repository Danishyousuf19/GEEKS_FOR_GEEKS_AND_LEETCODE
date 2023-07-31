import java.util.Arrays;

public class missing_no {
	//sorting
	 public static int missingNumberSorting(int A[], int N)
	    {
		 Arrays.sort(A);
	    //System.out.println(Arrays.toString(A));
	    for(int i=0;i<N;i++) {
	    	//System.err.println("i=="+(i+1)+" A[i]=="+A[i]);
	    	if(A[i]!=i) {
	    		
	    		return (i);
	    	}
	    }
	        return N;
	    }
	public static void main(String[] args) {
		int[] a= {1,0,3};
System.out.println(missingNumberSorting(a,3));

	}
	
	 public static int missingNumber(int A[], int N)
	    {int sum=0;
		 for (int e:A) {
			 sum+=e;
		 }
		 int formula=N*(N+1)/2;
		 return formula-sum;
		    }
	 
}
