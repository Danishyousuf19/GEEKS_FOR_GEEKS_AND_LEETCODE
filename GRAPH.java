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
	public static void main(String[] args) {
		int  v=4;//vertics no
		ArrayList<edge>graph[]=new ArrayList[v];//Initially null//first change to empty
	}
}
