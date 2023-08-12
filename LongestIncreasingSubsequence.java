import java.util.*;

public class LongestIncreasingSubsequence {
	 public static int findLISLength1(int[] nums) {
	        int n = nums.length;
	        int[] lisLengths = new int[n];
	        int maxLength = 1;  // Minimum length is 1 (the element itself)

	        for (int i = 0; i < n; i++) {
	            lisLengths[i] = 1;  // Initialize each element's LIS length to 1

	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j]) {
	                    lisLengths[i] = Math.max(lisLengths[i], 1 + lisLengths[j]);
	                }
	            }

	            maxLength = Math.max(maxLength, lisLengths[i]);
	        }

	        return maxLength;
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 O(n*Logn)
	public static int findLISLength(int[] nums) {
        List<Integer> activeList = new ArrayList<>();
        
        for (int num : nums) {
            int insertionIndex = binarySearch(activeList, num);
            
            if (insertionIndex == activeList.size()) {
                activeList.add(num);
            } else {
                activeList.set(insertionIndex, num);
            }
        }
        
        return activeList.size();
    }
    
    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}
