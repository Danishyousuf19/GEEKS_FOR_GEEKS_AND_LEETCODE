
public class arrang_two {
	 public int[] rearrangeArray(int[] nums) {
	      int t[]=new int[nums.length];
	      int i=0,k=1;
	      for(int l=0;l<nums.length;l++){
	          if(nums[l]>=0){
	              t[i]=nums[l];
	              i+=2;
	          }
	          else{
	              t[k]=nums[l];
	              k+=2;
	          }
	      }  
	      return t;
	    }
}
