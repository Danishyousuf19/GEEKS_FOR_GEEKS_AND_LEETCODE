import java.util.*;

public class find_duplicaterow {
	public static ArrayList<Integer> repeatedRows(int m1[][], int m, int n) {
		// code here
		HashSet<String> set = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			StringBuilder sb = new StringBuilder("");
			for (int j = 0; j < n; j++) {
				sb.append(m1[i][j]);
			}
			if (set.contains(sb.toString()))
				ans.add(i);
			else {
				set.add(sb.toString());
			}
		}
		return ans;
	}
}
