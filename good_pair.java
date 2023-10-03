import java.util.HashMap;

public class good_pair {
	public int numIdenticalPairs(int[] nums) {
		HashMap<Integer,Integer>map=new HashMap<>();
		int c=0;
		for(int n:nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
			c+=map.get(n)-1;
		}
		return c;
	}
}
