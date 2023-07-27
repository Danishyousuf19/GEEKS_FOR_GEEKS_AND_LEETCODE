
public class Split_Array_Largest_Sum {
	 public int splitArray(int[] nums, int k) {
	        int s=0;
	        int e=0;
	        for(int j:nums) {
	        	s=Math.max(s, j);
	        	 e+=j;
	        }
	        while(s<e) {
	        	int m=s+(e-s)/2;
	        	int sum=0;
	        	int peices=1;
	        	for(int f:nums) {
	        		if(sum+f>m) {
	        			sum=f;
	        			peices++;
	        		}
	        		else {
	        			sum+=f;
	        		}
	        	}
	        	if(peices>k) {
	        		s=m+1;
	        	}
	        	else {
	        		e=m;
	        	}
	        }
	        return s;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
