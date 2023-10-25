import java.util.*;

public class ranson {
	 public boolean canConstruct(String ransomNote, String magazine) {
	        int[] charCounts = new int[26]; // Assuming lowercase English letters
	        
	        for (char c : magazine.toCharArray()) {
	            charCounts[c - 'a']++;
	        }

	        for (char c : ransomNote.toCharArray()) {
	            if ( !(charCounts[c - 'a'] > 0 ) ) {
	                return false;
	            } 
	                charCounts[c - 'a']--;
	        }
	        
	        return true;
	    }
	 public static boolean canConstruct1(String ransomNote, String magazine) {
		    HashSet<Character> list = new HashSet<>();
		        for (char c : ransomNote.toCharArray())
		            list.add(c);
		        
		       for (Character c : list)
		       {
		           int count1 = countChar(ransomNote , c);
		           int count2 = countChar(magazine , c);
		            if (count1 > count2)
		                return false;
		       }
		        return true;
		}
		    public static int countChar(String str , char c)
		    {
		        int count = 0;
		        for (int i = 0; i < str.length(); i++) {
		            if (str.charAt(i) == c) {
		                count++;
		            }
		        }
		        return count;
		    }
		    public boolean canConstruc3t(String ransomNote, String magazine) {
		        if(ransomNote.length() > magazine.length()){
		            return false;
		        }

		        HashMap<Character,Integer> map = new HashMap<>();

		        for(int i=0;i<magazine.length();i++){
		            char ch = magazine.charAt(i);
		            if(map.containsKey(ch)){
		                map.put(ch, map.get(ch)+1);
		            }else{
		                map.put(ch,1);
		            }
		        }

		        for(int i=0;i<ransomNote.length();i++){
		            char ch = ransomNote.charAt(i);
		            if(map.containsKey(ch)){
		                if(map.get(ch) == 1){
		                    map.remove(ch);
		                }else{
		                    map.put(ch, map.get(ch)-1);
		                }
		            }else{
		                return false;
		            }
		        }
		        return true;
		    }
		
		
}
