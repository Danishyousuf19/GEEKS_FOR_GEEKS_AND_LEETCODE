import java.util.Arrays;

public class close_str {
	public boolean closeStrings(String w1, String w2) {
		int f1[] = new int[26], f2[] = new int[26];
		for (char c : w1.toCharArray()) {
			f1[c - 'a']++;
		}
		for (char c : w2.toCharArray()) {
			f2[c - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (f1[i] == 0 && f2[i] != 0 || f2[i] == 0 && f1[i] != 0)
				return false;
		}
		Arrays.sort(f1);
		Arrays.sort(f2);
		for (int i = 0; i < 26; i++) {
			if (f1[i] != f2[i])
				return false;
		}
		return true;

	}
}
