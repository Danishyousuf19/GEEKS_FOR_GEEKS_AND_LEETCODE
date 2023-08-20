import java.util.*;
public class roman_to_int {
	 public int romanToInt(String s) {
	        int ans=0;
	        Map<Character , Integer>map=new HashMap<>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('D', 100);
	        map.put('M', 1000);
	        for(int i=0;i<s.length();i++) {
	        	if(i<s.length()-1&&map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
	        		ans-=map.get(s.charAt(i));
	        	}
	        	else {
	        		ans+=map.get(s.charAt(i));
	        	}
	        }
	        return ans;
	    }
}
