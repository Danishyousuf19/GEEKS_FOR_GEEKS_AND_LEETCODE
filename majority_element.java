import java.util.*;

import com.sun.net.httpserver.Authenticator.Result;

public class majority_element {
	 public List<Integer> majority_brute(int[] nums) {
	        HashMap<Integer,Integer>map=new HashMap<>();
	        List <Integer>list=new ArrayList<>();
	        int target = (int)(nums.length / 3) + 1;
	        for(int i=0;i<nums.length;i++) {
	        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	        	if(map.get(nums[i])>=target) {
	        		list.add(nums[i]);
	        	}
	        	if(list.size()==2)return list;
	        }
	        return list;
	    }
	 public List<Integer> majorityElement(int[] nums) {
	        int c1,c2,s1,s2;
c1=c2=s1=s2=0;
	        for(int num:nums) {
	        	if(num==s1)c1++;
	        	else if(num==s2)c2++;
	        	else if(c1==0) {
	        		c1=1;
	        		s1=num;
	        	}
	        	else if(c2==0) {
	        		c2=1;
	        		s2=num;
	        	}
	        	else {
	        		c1--;
	        		c2--;
	        	}
	        }
	        c1=c2=0;
	        for(int n:nums) {
	        	if(n==s1)c1++;
	        	else if(n==s2)c2++;
	        }
	        List <Integer>list=new ArrayList<>();
	        if(c1>nums.length/3)list.add(s1);
	        if(c2>nums.length/3)list.add(s2);
	        return list;
	    }
}
