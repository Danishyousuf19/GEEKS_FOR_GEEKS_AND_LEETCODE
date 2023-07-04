import java.util.Arrays;
import java.util.HashSet;

public class non_repeting_numbers {
	public int[] singleNumber(int[] nums)
    {
		int a[]=new int[2];
		HashSet<Integer>x=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!x.contains(nums[i])) {
				x.add(nums[i]);
				
			}
			else {
				x.remove(nums[i]);
			}
		}
		int j=0;
		for(int i:x) {
			a[j++]=i;
		}
		Arrays.sort(a);
		return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
