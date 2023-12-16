
public class anagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 'a']++;
		}
		for (char c : t.toCharArray()) {

			if (a[c - 'a'] < 1)
				return false;

			a[c - 'a']--;
		}
		return true;
	}
}
