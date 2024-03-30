import java.util.Arrays;

public class missing {
	class Solution {
		public int firstMissingPositive(int[] nums) {
			int p = 1;
			Arrays.sort(nums);
			for (int i = 0; i < nums.length; i++) {
				if (p != nums[i])
					return p;

				else {
					p++;
				}
				
			}
			return nums.length;
		}
	}
	class SolutionB {
	    public int firstMissingPositive(int[] nums) {
	        int n = nums.length;
	        boolean[] found = new boolean[n+1];
	        for(int i = 0;i< n; i++){
	            if (nums[i]>0 && nums[i]<= n){
	                found[nums[i]]=true;

	            }
	        }
	        for(int i= 1;i<=n;i++){
	            if(!found[i]){
	                return i;
	            }
	        }
	        return n+1;
	 }
	}
	class SolutionC {
	    public int firstMissingPositive(int[] nums) {
	        int n = nums.length;

	        // Step 1: Move all positive numbers to the beginning of the array
	        int j = 0;
	        for (int i = 0; i < n; i++) {
	            if (nums[i] > 0) {
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                j++;
	            }
	        }

	        // Step 2: Mark the presence of each positive number by changing the sign of the corresponding index to negative
	        for (int i = 0; i < j; i++) {
	            int num = Math.abs(nums[i]);
	            if (num <= j && nums[num - 1] > 0) {
	                nums[num - 1] = -nums[num - 1];
	            }
	        }

	        // Step 3: Find the first index with a positive value
	        for (int i = 0; i < j; i++) {
	            if (nums[i] > 0) {
	                return i + 1;
	            }
	        }

	        // If all positive integers from 1 to j are present, return j + 1
	        return j + 1;
	    }
	}

}
