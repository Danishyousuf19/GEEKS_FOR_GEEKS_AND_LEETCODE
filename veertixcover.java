import java.util.ArrayList;
import java.util.List;

public class veertixcover {
	class Solution {
	    public static int vertexCover(int n, int m, int[][] edges) {
	        int ans = Integer.MAX_VALUE;
	        
	        outerloop:
	        for(int i = 0; i <= 1 << n; i++){
	            for(int j = 0; j < m; j++)
	            if(!((1 << (edges[j][0] - 1) & i) != 0 || (1 << (edges[j][1] - 1) & i) != 0)) continue outerloop;
	            ans = Math.min(ans, Integer.bitCount(i));
	        }
	        return ans;
	    }
	}
}
class Solutihhhon {
    static int min;
    static void solve(int index, int bits, int n, int m, int edges[][]){
        if(index > n){
            for(int i = 0; i < m; i++) if(!((1 << (edges[i][0] - 1) & bits) != 0 || (1 << (edges[i][1] - 1) & bits) != 0)) return;
            min = Math.min(min, Integer.bitCount(bits));
            return ;
        }
        solve(index + 1, bits, n, m, edges);
        solve(index + 1, bits | 1 << (index - 1), n, m, edges);
    }
    public static int vertexCover(int n, int m, int[][] edges) {
        min = Integer.MAX_VALUE;
        solve(1, 0, n, m, edges);
        return min;
    }
}


class Soluthvhvion {
    public static int vertexCover(int num_nodes, int num_edges, int[][] edges) {
        // Base case: If there are no nodes, the minimum vertex cover size is 0.
        if (num_nodes == 0) {
            return 0;
        }

        // Initialize separate lists for edges connected to two different vertices.
        List<int[]> first_vertex_edges = new ArrayList<>();
        List<int[]> second_vertex_edges = new ArrayList<>();

        // Get the first edge to compare with other edges.
        int first_vertex = edges[0][0];
        int second_vertex = edges[0][1];
        int count_first_vertex = 0;
        int count_second_vertex = 0;

        // Iterate through the edges to categorize them based on their vertices.
        for (int[] edge : edges) {
            int vertex1 = edge[0];
            int vertex2 = edge[1];

            // Check if the current edge is not connected to the first vertex.
            if (vertex1 != first_vertex && vertex2 != first_vertex) {
                first_vertex_edges.add(edge);
                count_first_vertex++;
            }

            // Check if the current edge is not connected to the second vertex.
            if (vertex1 != second_vertex && vertex2 != second_vertex) {
                second_vertex_edges.add(edge);
                count_second_vertex++;
            }
        }

        // Recursively find the minimum vertex cover size for both sets of edges.
        return 1 + Math.min(
            vertexCover(count_first_vertex, first_vertex_edges.size(), first_vertex_edges.toArray(new int[0][])),
            vertexCover(count_second_vertex, second_vertex_edges.size(), second_vertex_edges.toArray(new int[0][]))
        );
    }
}

