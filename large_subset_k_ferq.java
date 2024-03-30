import java.util.HashMap;
import java.util.Map;

public class large_subset_k_ferq {
	public int maxSubarrayLength(int[] A, int k) {
	    // Create a HashMap to store the count of elements in the current window
	    Map<Integer, Integer> count = new HashMap<>();
	    // Initialize the result variable to store the maximum subarray length
		int res = 0, i = 0, n = A.length;
		// Iterate through the array using two pointers i and j
		for (int j = 0; j < n; ++j) {
			// Update the count of the current element
			count.put(A[j], count.getOrDefault(A[j], 0) + 1);
			// If count of any element exceeds k, move the window's left pointer to shrink
			// the window
			while (count.get(A[j]) > k)
				count.put(A[i], count.get(A[i++]) - 1);
			// Update the result by comparing with the current window size
			res = Math.max(res, j - i + 1);
		}
	   
	    
	    
	    // Return the maximum subarray length
	    return res;
	    }
}
