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
	//problem infinte loop in cycle
//	static void printAllPathUsingStack(int v, int start, int tar, ArrayList<edge> graph[]) {
//		Stack<Integer> s = new Stack<>();
//		boolean vis[] = new boolean[v];
//		List<Integer> path = new ArrayList<>();
//	    path.add(start);
//		
//		while (!s.isEmpty()) {
//			int curr = s.peek();
//			if (curr == tar) {
//				System.out.println(path);
//				path.remove(path.size() - 1);
//				s.pop();
//				continue;
//
//			}
//			 boolean hasUnvisitedNode = false;
//			for (int i = graph[curr].size() - 1; i >= 0; i--) {
//				edge e = graph[curr].get(i);
//				 if (!vis[e.dest]) {
//		                vis[e.dest] = true;
//		                path.add(e.dest);
//		                s.push(e.dest);
//		                hasUnvisitedNode = true;
//		                break;
//		            }
//			}
//			if (!hasUnvisitedNode) {
//	            vis[curr] = false;
//	            path.remove(path.size() - 1);
//	            s.pop();
//	        }
//
//		}
//	}
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

static void dfs(ArrayList<edge>graph[],int curr ,boolean vis[]) {
	System.out.print(curr+" ");
	vis[curr]=true;
	for(int i=0;i<graph[curr].size();i++) {
		edge e=graph[curr].get(i);
		if(vis[e.dest]==false)dfs(graph,e.dest,vis);
	}
}

//print all path
static void  printAllPath(String path,int dst,int target,ArrayList<edge>[]graph,boolean vis[]) {
	if(dst==target) {
		System.out.println(path);
		return;
	}
	for(int i=0;i<graph[dst].size();i++){
		edge e=graph[dst].get(i);
		if(vis[e.dest]==false) {
			vis[e.dest]=true;
			printAllPath(path+e.dest, e.dest, target, graph, vis);
			vis[e.dest]=false;
		}
	}
	
}
static void untiltop(ArrayList<edge>graph[],int curr,boolean vis[],Stack<Integer>s) {
	vis[curr]=true;
	for(int i=0;i<graph[curr].size();i++) {
		edge e=graph[curr].get(i);
		if(!vis[e.dest]) {
			untiltop(graph, e.dest, vis, s);
		}
	}
	s.push(curr);
	
}
static void topological(ArrayList<edge>graph[],int v) {
	boolean[]vis=new boolean[v];
	Stack<Integer>s=new Stack<>();
	for(int i=0;i<v;i++) {
		if(!vis[i])untiltop(graph, i, vis, s);
	}
	for(int i=0;i<s.size();i++) {
		System.out.print(s.pop()+" ");
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
		System.out.println();
//for not connneccted
		boolean vis[]=new boolean[v];
		for(int i=0;i<v;i++) {
			
			if(!vis[i]) {
				bfs2(graph, i, vis);
			}
		}
		System.out.println();
		boolean vis2[]=new boolean[v];
		boolean vis3[]=new boolean[v];
		dfs(graph, 0, vis2);
//		/notconnected/
		for(int i=0;i<v;i++) {
			if(vis3[i]==false) {
				dfs(graph,i,vis);
			}
		}
		System.out.println();
		topological(graph, v);
	}
}
