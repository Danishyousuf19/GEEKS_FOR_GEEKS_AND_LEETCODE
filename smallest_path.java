import java.util.Arrays;

public class smallest_path {
	 
	public int[] shortestPath(int N,int M, int[][] edges) {
	//Code here
	int dist[] = new int[N];
	Arrays.fill(dist,Integer.MAX_VALUE);
	dist[0]=0;
	 
	for(int i=0;i<M-1;i++)
	{
	    for(int [] val:edges)
	    {
	        int src=val[0];
	        int dest=val[1];
	        int w = val[2];
	        
	        if(dist[src]!=Integer.MAX_VALUE && dist[src]+w<dist[dest])
	        {
	            dist[dest]=dist[src]+w;
	        }
	    }
	}
	 
	for(int i=0;i<N;i++)
	{
	    if(dist[i]==Integer.MAX_VALUE)dist[i]=-1;
	}
	 
	return dist;
	 
	}
}
