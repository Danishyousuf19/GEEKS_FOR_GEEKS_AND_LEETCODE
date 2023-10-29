import java.util.ArrayList;



public class WEIGHTED_GRAPH {
	static class edge {
		int src, dst, wt;

		edge(int i, int j, int k) {
			src = i;
			dst = j;
			wt = k;
		}
		
	}
	static void create(ArrayList<edge>graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]= new ArrayList<edge>();
		}
		graph[0].add(new edge(0,2,2));
		graph[1].add(new edge(1,4,3));
		graph[1].add(new edge(1,2,4));
		graph[1].add(new edge(1,3,6));
		graph[2].add(new edge(2,0,2));
		graph[2].add(new edge(2,1,4));
		graph[2].add(new edge(2,3,1));
		graph[3].add(new edge(3,1,6));
		graph[3].add(new edge(3,2,1));
		graph[4].add(new edge(4,1,3));
		
	}
	public static void main(String sa[]) {
		int V=5;
		ArrayList<edge>graph[]=new ArrayList[V];
		create(graph);
		for(int i=0;i<graph[3].size();i++) {
			edge e=graph[3].get(i);
			System.out.println(e.src+"-->"+e.dst+" = "+e.wt);
		}
	}
}
