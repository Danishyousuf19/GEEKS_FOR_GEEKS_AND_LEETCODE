import java.util.Arrays;

public class longest_common_subSequence {
static int lcs(int a , int b , String x ,String y) {
	int dp[][]=new int[a+1][b+1];
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=b;j++) {
			if(x.charAt(i-1)==y.charAt(j-1))
				dp[i][j]=dp[i-1][j-1]+1;
			else
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
		}
	}
	 return dp[a][b];
	 
 }
public int helper(String s,int[][] matrix,int i, int j) {
    if(i==j)
        return 1;
    if (i>j)
        return 0;
    if(matrix[i][j]!=-1)
        return matrix[i][j];
    if(s.charAt(i)==s.charAt(j)) 
        return matrix[i][j] = helper(s,matrix,i+1,j-1)+2;
    return matrix[i][j] = Math.max(helper(s,matrix,i+1,j),helper(s,matrix,i,j-1));
}
public int longestPalindqromeSubseq(String s) {
    int size = s.length();
    int[][] mat = new int[size][size];
    for (int[] ints : mat) 
        Arrays.fill(ints, -1);
    return helper(s,mat,0,size-1);
}
}
