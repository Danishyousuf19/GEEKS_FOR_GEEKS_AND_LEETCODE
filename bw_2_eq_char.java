import java.util.*;

public class bw_2_eq_char {
	 public int maxLenbetweenEqualCharacters(String s) {
		 int max=-1;
		         for(int i=0;i<s.length();i++){
		             int j=s.length()-1;
		 while(j>i){
		     if(s.charAt(i)==s.charAt(j))return j-i-1;
		     j--;
		 }
		         }
		         return -1;
		     }
	 public int maxLengthBetweenEqualCharacters(String s) {
	        int max=-1;
	        Map<Character,Integer>map=new HashMap<>();
	        for(int i=0;i<s.length();i++) {
	        	if(map.containsKey(s.charAt(i))){
	        		max=Math.max(max, i-map.get(s.charAt(i))-1);
	        	}
	        	else {
	        		map.put(s.charAt(i), i);
	        	}
	        }
	        return max;
	    }
}
