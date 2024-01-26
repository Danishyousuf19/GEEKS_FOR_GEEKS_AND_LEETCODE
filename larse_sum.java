
public class larse_sum {
	 public double findMaxAverage(int[] nums, int k) {
	        double avg=0;
	        int temp=0;
	        for(int i=0;i<nums.length;i++){
	            if(temp+nums[i]<=0){
	                temp=0;
	                avg=nums[i];
	            }
	            else{
	                temp+=nums[i];
	                avg=Math.max(temp,avg);
	            }
	        }
	        return avg/k;
	    }
}
