import java.util.*;

public class water_plants {
	class Solution
	{
	    int min_sprinklers(int gallery[], int n)
	    {
	        // code here
	        List<int[]> spk = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            if (gallery[i] != -1) {
	                spk.add(new int[]{Math.max(0, i - gallery[i]), Math.min(n - 1, i + gallery[i])});
	            }
	        }

	        Collections.sort(spk, (a, b) -> Integer.compare(a[0], b[0]));

	        int start = 0;
	        int i = 0;
	        int ans = 0;

	        while (start < n) {
	            int maxRight = -1;
	            while (i < spk.size()) {
	                if (spk.get(i)[0] > start)
	                    break;

	                maxRight = Math.max(maxRight, spk.get(i)[1]);
	                i++;
	            }

	            if (maxRight < start)
	                return -1;

	            ans++;
	            start = maxRight + 1;
	        }

	        return ans;
	    }
	}
}
