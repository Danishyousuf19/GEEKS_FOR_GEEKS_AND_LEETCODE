
public class remove_element {
	 public int removeElement(int[] nums, int val) {
	       int idx=0;
	       for(int i=0;i<nums.length;i++){
	           if(nums[i]!=val)
	         //swap
	          {nums[idx]=nums[i];
	            idx++;}
	       }return idx; 
	    }
}
