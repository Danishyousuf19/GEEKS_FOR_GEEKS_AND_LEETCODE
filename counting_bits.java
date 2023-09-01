
public class counting_bits {
	 public int[] countBits(int n) {
	        int[] ans=new int[n+1];
			for (int i=0;i<=n;i++) {
	        	ans[i]=noof1s(i);
	        }
	        return ans;
	    }

	static int noof1s(int i) {
		if(i==0)return 0;
		if(i==1)return 1;
		if(i%2==0)return noof1s(i/2);
		else return 1+noof1s(i/2); 
		
		
	}
	class Solution {
	    public int[] countBits(int n) {
	        int[] R = new int[n+1];
	        if(n==0) return R;
	        
	        for(int i=1;i<n+1;i++) {
	            if(i%2 == 0) { // number is even
	                R[i] = R[i/2];
	            }
	            else { // is odd
	                R[i] = R[i-1] + 1;
	            }
	        }
	        return R;
	    }
	}
}
