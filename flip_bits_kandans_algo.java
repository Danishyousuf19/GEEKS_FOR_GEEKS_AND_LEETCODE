
public class flip_bits_kandans_algo {
	public static int maxOnes(int a[], int n) {
        // Your code goes here
		
		int ones = 0,maxcount=0,currcount=0;
		for(int i=0;i<n;i++) {
			if(a[i]==1)ones++;
			int val=a[i]==0?1:-1;//flip 1-->-1and 0-->1 kandans algo
			currcount+=val;
			maxcount=Math.max(maxcount, currcount);
			if(currcount<0)currcount=0;
		}
		return ones+maxcount;
    }
}
//}
//STEPS:
//
//1. Count no. of 1,  here oneCnt = 2
//
//2. Flip all 0 to 1 and all 1 to -1 ( for finding the subarray containing maximum zero  )
//
//now ar = [-1,1,1,-1,1]
//
//3. according to Kadane's algo maximum sum  subarray of ar = 3 , which is the maximum zero subarray (after 0 converting to 1)
//
//so total 1's =  1's already present in ar + 1's after fliping maximum zero subarray
//
//so return oneCnt + maxSum(from kadane's algo)