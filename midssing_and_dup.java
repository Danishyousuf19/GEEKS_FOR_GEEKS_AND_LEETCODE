
public class midssing_and_dup {
	 public int[] findErrorNums(int[] nums) {
	     int x[] = new int[nums.length+1];

	     for(int i:nums){
	         x[i]++;
	     }

	     int dup=0 , miss=0;

	     for(int i=1;i<x.length;i++){
	         if(x[i]==2){
	             dup=i;
	         }
	         if(x[i] ==0){
	             miss=i;
	         }
	     }

	return new int[]{dup,miss};}
	 public int[] findErrorNnums(int[] nums) {
		    int[] result = new int[2];
		    int n = nums.length;

		    for (int i = 0; i < n; i++) {
		        while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
		            // Swap nums[i] with nums[nums[i] - 1]
		            int temp = nums[i];
		            nums[i] = nums[temp - 1];
		            nums[temp - 1] = temp;
		        }
		    }

		    for (int i = 0; i < n; i++) {
		        if (nums[i] != i + 1) {
		            result[0] = nums[i];  // The repeated number
		            result[1] = i + 1;     // The missing number
		            break;
		        }
		    }

		    return result;
		}

}
