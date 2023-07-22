
public class rotated_array_search {
	 
	 static int search1(int a[], int l, int h, int k)
	    {
		  while(l<=h) {
			  int mid=l+(h-l)/2;
			  if(k==a[mid]) {
				  return mid;
			  }
			  //lefted part sorted
			  if(a[l]<=a[mid]) {
			  if(k>=a[l]&&k<a[mid]) {
				 h=mid-1; 
			  }
			  else {
				  l=mid+1;
			  }
			  }
			  else {
				  if(k>a[mid]&&k<=a[h]) {
					  l=mid+1;
				  }
				  else {
					  h=mid-1;
				  }
			  }
		  }
	        // l: The starting index
	        // h: The ending index, you have to search the key in this range
	        // Complete this function
		  return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,1};
System.out.println(search(a,0));
	}
	  public static int search(int[] nums, int target) {
		  int l=0,h=nums.length-1;
		  while(l<=h) {
			  int mid=l+(h-l)/2;
			  if(nums[mid]==target)
				  return mid;
			  if(nums[l]<=nums[mid]) {
				  if(target>=nums[l]&&target<nums[mid])
					  h=mid-1;
				  else
					  l=mid+1;
			  }
			  else {
				  if(target>nums[mid]&&target<=nums[h])
					  l=mid+1;
				  else
					  h=mid-1;
			  }
		  }
	        return -1;
	    }

}
