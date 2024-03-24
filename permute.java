
public class permute {
	class Solution {
	    public int[] buildArray(int[] nums) {
	        permut(nums,0);
	        return nums;
	    }
	    public void permut(int[] nums,int start){
	        if(start<nums.length){
	            int temp = nums[start];
	            int result = nums[temp];
	            permut(nums,start+1);
	            nums[start] = result;
	        }
	    }
	}
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            // this is done to keep both old and new value together. 
            // going by the example of [5,0,1,2,3,4]
            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
            // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
            // if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
        }
        
        for(int i=0; i<n; i++){
            nums[i] = nums[i]/n;
        }
        
        return nums;
    }
}
