
public class subarray_product {
	public class Solution {
	    public int numSubarrayProductLessThanK(int[] nums, int k) {
	        // If k is 0, no subarray product can be less than 0
	        if (k == 0) {
	            return 0;
	        }
	        
	        // Initialize count and product
	        int c = 0;
	        int p = 1;
	        
	        // Initialize start index of subarray
	        int i = 0;
	        
	        // Loop through the indices of the array
	        for (int j = 0; j < nums.length; j++) {
	            // Update product by multiplying with current element
	            p *= nums[j];
	            
	            // If product is greater than or equal to k
	            while (i <= j && p >= k) {
	                // Divide product by the element at start index
	                p /= nums[i];
	                // Move start index to the right
	                i++;
	            }
	            
	            // Add the count of subarrays ending at index j
	            c += (j - i + 1);
	        }
	        
	        // Return the total count of subarrays
	        return c;
	    }
	}

}
