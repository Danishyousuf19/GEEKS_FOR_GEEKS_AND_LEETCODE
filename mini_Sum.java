import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class mini_Sum {

	static class pair {
		int k;
		int v;

		pair(int i, int j) {
			k = i;
			v = j;
		}
	}

	static int minValue(String s, int k) {
		// code here
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray())
			{map.put(c, map.getOrDefault(c, 0) + 1);}
		PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> y.v - x.v);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			pq.add(new pair(entry.getKey(), entry.getValue()));
		}
		int ans = 0;
		while (!pq.isEmpty()) {
			if (k == 0)
				break;
			pair n = pq.poll();
			n.v -= 1;
			if (n.v != 0)
				pq.add(new pair(n.k, n.v));
			k--;
		}
		while (!pq.isEmpty()) {
			pair n = pq.poll();
			ans += (n.v * n.v);
		}
		return ans;

	}
}
