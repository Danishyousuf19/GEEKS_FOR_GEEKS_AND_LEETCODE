
public class count_0_in_2d {
	static int countZeros(int A[][], int N)
    {int c=0;
        for (int i=0;i<N;i++) {
        	for (int j=0;j<N;j++)
        	{
        		if(A[i][j]==0) {
        			c++;
        		}
        		
        	}
        }
        return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
