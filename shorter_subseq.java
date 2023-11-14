import java.util.Scanner;

public class shorter_subseq {
	public static int shortestCommonSupersequence(String x, String y, int m, int n) {
	    int[][] dp = new int[m + 1][n + 1]; // Fix the dimensions

	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (x.charAt(i - 1) == y.charAt(j - 1))
	                dp[i][j] = 1 + dp[i - 1][j - 1];
	            else
	                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	        }
	    }

	    return m + n - dp[m][n];
	}
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n=sc.nextInt();
	        System.out.print("Enter k: ");
	        int k=sc.nextInt();
	        k%=n;
	        int arr[]=new int[n];
	        int i,temp;
	        System.out.print("Enter elements:");
	        for(i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        for(i=1;i<=k;i++)
	        {
	            temp=arr[0];
	            for(int j=1;j<n;j++)
	            {
	                arr[j-1]=arr[j];
	            }
	            arr[n-1]=temp;
	        }
	        for(int j:arr)
	        System.out.print(j+"  ");
	    }
}
