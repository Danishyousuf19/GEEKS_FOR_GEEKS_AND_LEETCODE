import java.util.*;

public class sum_0_subaray {
	 public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
		 int n = a.length;
		    int m = a[0].length;

		    // Corrected array initialization
		    int sum[][] = new int[n][m];

		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < m; j++) {
		            sum[i][j] = a[i][j] + (j > 0 ? sum[i][j - 1] : 0);
		        }
		    }

		    int maxArea = 0, startRow = 0, endRow = -1, startCol = 0, endCol = -1;

		    for (int c1 = 0; c1 < m; c1++) {
		        for (int c2 = c1; c2 < m; c2++) {
		            int temp[] = new int[n];
		            for (int i = 0; i < n; i++) {
		                // Corrected indexing in the temp array
		                temp[i] = sum[i][c2] - (c1 > 0 ? sum[i][c1 - 1] : 0);
		            }

		            Map<Integer, Integer> map = new HashMap<>();
		            map.put(0, -1);
		            int csum = 0;

		            for (int i = 0; i < n; i++) {
		                csum += temp[i];
		                if (map.containsKey(csum)) {
		                    int area = (c2 - c1 + 1) * (i - map.get(csum));
		                    // Compare absolute values
		                    if (Math.abs(area) > Math.abs(maxArea)) {
		                        maxArea = area;
		                        startRow = map.get(csum) + 1;
		                        endRow = i;
		                        startCol = c1;
		                        endCol = c2;
		                    }
		                } else {
		                    map.put(csum, i);
		                }
		            }
		        }
		    }

		    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		    if (Math.abs(maxArea) == 0) return ans;

		    for (int i = startRow; i <= endRow; i++) {
		        ArrayList<Integer> temp = new ArrayList<>();
		        for (int j = startCol; j <= endCol; j++) {
		            temp.add(a[i][j]);
		        }
		        ans.add(temp);
		    }
		    return ans;
		}
}
