import java.util.*;

public class max_difference_bw_same {
	int maxDistance(int arr[], int n) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxd = 0;
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {

				map.put(arr[i], i);
				continue;
			}
			int currd=i-map.get(arr[i]);
			maxd=Math.max(maxd, currd);
		}
		return maxd;
	}
}
