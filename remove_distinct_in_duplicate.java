import java.util.*;

public class remove_distinct_in_duplicate {
	public int[] singleNumber(int[] nums) {
		int a[] = new int[2];
		int xor=0;
		for(int i:nums) {
			xor^=i;
		}
		int rightmostbit=xor&(-xor);
		for(int j=0;j<nums.length;j++) {
			if((nums[j]&rightmostbit)!=0) {
				a[0]^=nums[j];
			} 
			else {
				a[1]^=nums[j];
			}
		}
		if (a[1] < a[0]) {
			int t = a[0];
			a[0] = a[1];
			a[1] = t;
		}
		return a;

	}
}
