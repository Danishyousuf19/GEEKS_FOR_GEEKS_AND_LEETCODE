import java.util.*;

public class find_next_grrater {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] index = new int[10001];
        for(int i = 0; i < nums2.length; i++)
            index[nums2[i]] = i;

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = findNextGreater(index[nums1[i]], nums2);
        }
        
        return nums1;
    }

    private int findNextGreater(int index, int[] nums2){
        for(int i = index + 1; i < nums2.length; i++){
            if(nums2[i] > nums2[index])
                return nums2[i];
        }
        return -1;
    }
    public int[] nextGreaterElenment(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
