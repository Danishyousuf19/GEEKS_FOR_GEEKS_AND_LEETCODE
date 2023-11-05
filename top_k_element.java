import java.util.*;

public class top_k_element {
	 public int[] topK(int[] nums, int k) {
		 HashMap<Integer,Integer>freq=new HashMap<>();
		 for(int i=0;i<nums.length;i++) {
			 freq.put(nums[i],freq.getOrDefault(nums[i], 0)+1);
		 }
		 PriorityQueue <Integer>pq=new PriorityQueue<>((a,b)->{
			 if(freq.get(a)==freq.get(b))return b-a;
			 return freq.get(b)-freq.get(b);
			 
		 });
		 for(int num:freq.keySet()) {
			 pq.add(num);
		 }
		 int a[]=new int [k];
		 for(int i=0;i<k;i++) {
			 a[i]=pq.poll();
		 }
	     return a;
	    }
}
