import java.util.HashMap;
import java.util.Map;

public class sme_freq {
	boolean sameFreq(String s) {
		HashMap<Character, Integer> mp = new HashMap<>();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}

		int sz = mp.size();
		int avg = (int) (n / sz);

		if (n - (sz * avg) > 1) // we need at most one character to delete
			return false;

		for (HashMap.Entry<Character, Integer> m : mp.entrySet())
			if (m.getValue() < avg)
				return false;

		return true;
	}

	boolean same(String a, int n) {
		HashMap<Character, Integer> m = new HashMap<>();
		for (char i : a.toCharArray()) {
			m.put(i, m.getOrDefault(i, 0) + 1);
		}
		int z = m.size();
		int avg = (int) (n / z);
		if (n - z * avg > 1)
			return false;
		for (Map.Entry<Character, Integer> e : m.entrySet()) {
			if (e.getValue() < avg)
				return false;
		}
		return true;
	}
}
