import java.util.*;

public class levelOfNode {
	int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
		int l=0;
		boolean vis[]=new boolean[V];
		Queue<Integer>q=new LinkedList<>();
		q.add(0);
		while(!q.isEmpty()) {
			int s=q.size();
			while(s!=0) {
				int x=q.poll();
				if(x==X)return l;
				vis[x]=true;
				for (int k:adj.get(x)) {
					if(vis[k]!=true)q.add(k);
				}
				s--;
			}
			l++;
		}
		return -1;
		
    }
}
