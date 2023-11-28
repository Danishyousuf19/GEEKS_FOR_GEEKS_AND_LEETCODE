
public class max_sum {
	public int maxSubArray(int[] nums) {
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+cs<nums[i]){
                cs=nums[i];
            }
            else{
                cs+=nums[i];
                if(cs>max)max=cs;
            }
        }
        return max;}
        public int maxSjubArray(int[] nums) {
            int cs=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){ 
                    cs+=nums[i];
                    if(cs>max)max=cs;
                if(cs<0)cs=0;
            }
            return max;
        }
    }