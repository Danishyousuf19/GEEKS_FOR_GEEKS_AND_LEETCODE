
public class sort_aray_by_parity {
	 public int[] sortArrayByParity(int[] nums) {
	        if(nums.length==1)return nums;
	        int i=0;int j=nums.length-1;
	        while(i<j) {
	        	while(i<j&&nums[i]%2==0)i++;
	        	while(i<j&&nums[j]%2!=0)j--;
	        	int t=nums[i];
	        	nums[i]=nums[j];
	        	nums[j]=t;
	        }
	        return nums;
	    }
}
