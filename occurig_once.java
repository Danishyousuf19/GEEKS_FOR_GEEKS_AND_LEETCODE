
public class occurig_once {
	public static int search(int A[], int N)
    {
		for(int i=0;i<N-1;i+=2) {
    	if(A[i]!=A[i+1]) {
    		return A[i];
    	}
    	
    }
        return A[N-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
