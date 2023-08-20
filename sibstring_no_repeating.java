import java.util.*;

public class sibstring_no_repeating {
	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int maxLength = 0;
		Set<Character> charSet = new HashSet<>();
		int left = 0;

		for (int right = 0; right < n; right++) {
			if (!charSet.contains(s.charAt(right))) {
				charSet.add(s.charAt(right));
				maxLength = Math.max(maxLength, right - left + 1);
			} else {
				while (charSet.contains(s.charAt(right))) {
					charSet.remove(s.charAt(left));
					left++;
				}
				charSet.add(s.charAt(right));
			}
		}

		return maxLength;
	}
	public int LongestSubstring(String s) {
		int n = s.length();
		int max = 0;
		int l=0;
		Map<Character , Integer>map=new HashMap<>();
		for(int r=0;r<n;r++) {
			if(!map.containsKey(s.charAt(r))||map.get(s.charAt(r))<l) {
				max=Math.max(max, r-l+1);
			}
			else {
				l=map.get(s.charAt(r))+1;
			}
			map.put(s.charAt(r),r);
		}
		
		return max;
		
	}
	
}
