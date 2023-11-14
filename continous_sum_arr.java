import java.util.HashMap;

public class continous_sum_arr {
	public boolean checkSubarraySum(int[] nums, int k) {
		 HashMap<Integer,Integer>map=new HashMap<>();
		 int rem=0;
		 for(int i=0;i<nums.length;i++) {
			 rem+=nums[i];
			 if(k!=0)rem%=k;
			 if(rem==0&&i>1)return true;
			 if(map.containsKey(rem)&& i-map.get(rem)>1)return true;
			 if(!map.containsKey(rem))map.put(rem, i);
		 }
	        return false;
	    }
	class Soluthhhion {
	    public boolean checkSubjjarraySum(int[] nums, int k) {
	        int last=-1;long sum=0;
	        for(int num:nums){
	            if(num==0 && last==0){
	                return true;
	            }
	            last=num;
	            sum+=num;
	        }
	        if(sum<k){
	            return false;
	        }
	        long rightsum=0;
	        for(int i=0;i<nums.length;i++){
	            long leftsum=0;
	            for(int j=nums.length-1;j>=0;j--){
	                long target=sum-rightsum-leftsum;
	                if(target<k){
	                    break;
	                }
	                if(target%k==0 && j-i>=1){
	                    return true;
	                }
	                leftsum+=nums[j];
	            }
	            rightsum+=nums[i];
	        }
	        return false;
	    }
	}
}
