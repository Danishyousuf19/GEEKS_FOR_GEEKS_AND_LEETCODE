import java.util.HashMap;

public class find_lucky_number_in_arrr {
	 public int findLucky(int[] arr) {
	        HashMap<Integer , Integer> map=new HashMap<>();
	        for(int i=0;i<arr.length;i++) {
	        	if(map.containsKey(arr[i])) {
	        		int val=map.get(arr[i]);
	        		map.put(arr[i],val+1);
	        	}
	        	else {
	        		map.put(arr[i], 1);
	        	}
	        }
	        int max=-1;
	        for(int num:map.keySet()) {
	        	if(num==map.get(num)) {
	        		max=num;
	        	}
	        }
	        return max;
	    }
}
