
public class minimumNoGame {
	 public int[] numberGame(int[] nums) {
	        int[] result = new int[nums.length];
	        for(int i = 0; i <= nums.length-1; i+=2)
	        {
	            result[i+1] = findAndReplaceMin(nums);
	            result[i] = findAndReplaceMin(nums);
	        }
	        return result;
	    }

	    public int findAndReplaceMin(int[] nums)
	    {
	        int min = nums[0];
	        int minIndex = 0;
	        for(int i = 1; i < nums.length; i++)
	        {
	            if(nums[i] < min)
	            {
	                min = nums[i];
	                minIndex = i;
	            }
	        }
	        nums[minIndex] = Integer.MAX_VALUE;
	        return min;
	    }
}
