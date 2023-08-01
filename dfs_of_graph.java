import java.util.ArrayList;

public class dfs_of_graph {
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfs(adj, 0, visited, res);
        return res;

}
public void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited, ArrayList<Integer> ans) {
        visited[node] = true;
        ans.add(node);
        for(int nbr: graph.get(node)) if(!visited[nbr]) dfs(graph, nbr, visited, ans);
    }
}
