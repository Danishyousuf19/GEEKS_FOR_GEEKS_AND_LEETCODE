
public class nCr {
	 static int nCr(int n, int r)
	    {
		 int noOfWays[]=new int [r+1];
		 noOfWays[0]=1;
		 for(int i=1;i<n;i++) {
			 for(int j=Math.min(r, i);j>=1;j--) {
				 noOfWays[j]=(noOfWays[j-1]+noOfWays[j])%1000000007;
			 }
		 }
		 return noOfWays[r];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
