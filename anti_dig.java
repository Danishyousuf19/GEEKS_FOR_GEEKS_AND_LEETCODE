
public class anti_dig {
	public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n=matrix.length,in=0,r=0,c=0;
        int a[]=new int[n*n];
        for(int i=0;i<2*n-1;i++){
            int j=r,k=c;
            while(j<n&&k>=0){
                a[in++]=matrix[j][k];
                j++;k--;
            }
            c++;
            if(c==n){
                c--;
                r++;
            }
        }
        return a;
    

    }


}
