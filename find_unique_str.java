
public class find_unique_str {
	 public String findDifferentBinaryString(String[] nums) {
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<nums.length;i++) {
	        	sb.append(nums[i].charAt(i)=='0'?'1':'0');
	        	
	        }return sb.toString();
	    }
}
