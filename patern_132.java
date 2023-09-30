import java.util.Stack;

public class patern_132 {
	 public boolean find132pattern(int[] nums) {
	        Stack<Integer>s=new Stack<>();
	        int third=Integer.MIN_VALUE;
	        for(int i=nums.length-1;i>=0;i--) {
	        	if(nums[i]<third)return true;
	        	while(!s.isEmpty()&&nums[i]>s.peek()) 
	        	{
	        		third=s.pop();
	        	}
	        	s.push(nums[i]);
	        }
	        return false;
	    }
}
