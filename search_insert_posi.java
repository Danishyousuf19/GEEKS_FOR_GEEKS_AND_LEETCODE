
public class search_insert_posi {
public int searchInsert(int[] nums, int t) {
        int s=0;
        int e=nums.length-1;
        while(s<=e) {
        	int m=s+(e-s)/2;
        	if(nums[m]==t) return m;
        	else if(nums[m]>t)e=m-1;
        	else s=m+1;
        }
        return s;
    }
}
