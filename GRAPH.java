import java.util.*;

public class GRAPH {
	static class edge{
		int src;
		int dest;
   public edge(int s,int d ){
			src=s;
			dest=d;
		}
	}
	public static void create(ArrayList<edge> graph[])  {
//		Initially null  --> first change to empty
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<edge>();
		}
		graph[0].add(new edge(0,2));
		graph[1].add(new edge(1,2));
		graph[1].add(new edge(1,3));
		graph[2].add(new edge(2,0));
		graph[2].add(new edge(2,1));
		graph[2].add(new edge(2,3));
		graph[3].add(new edge(3,1));
		graph[3].add(new edge(3,2));
	}
static void bfs(ArrayList<edge>graph[],int v) {
	Queue<Integer>q=new LinkedList();
	boolean vis[]=new boolean[v];
	q.add(0);
	while(!q.isEmpty()) {
		int curr=q.remove();
		if(vis[curr]==false) {
			System.out.print(curr+" ");
			vis[curr]=true;
			for(int  i=0;i<graph[curr].size();i++) {
				edge e=graph[curr].get(i);
				q.add(e.dest);
			}
			
		}
	}
	
}
static void bfs2(ArrayList<edge>graph[],int cur ,boolean[]vis) {
	Queue<Integer>q=new LinkedList();
	
	q.add(cur);
	while(!q.isEmpty()) {
		int curr=q.remove();
		if(vis[curr]==false) {
			System.out.print(curr+" ");
			vis[curr]=true;
			for(int  i=0;i<graph[curr].size();i++) {
				edge e=graph[curr].get(i);
				q.add(e.dest);
			}
			
		}
	}
	
}
	public static void main(String[] args) {
		int  v=4;//vertics no
		ArrayList<edge>graph[]=new ArrayList[v];//Initially null//first change to empty
		create(graph);
//		print grap[2]
		for(int i=0;i<graph[2].size();i++) {
			edge e=graph[2].get(i);
			System.out.println(e.src+"-->"+e.dest);
		}
		bfs(graph, v);
//for not connneccted
		for(int i=0;i<v;i++) {
			boolean vis[]=new boolean[v];
			if(vis[i]==false) {
				bfs2(graph, i, vis);
			}
		}
	}
}
