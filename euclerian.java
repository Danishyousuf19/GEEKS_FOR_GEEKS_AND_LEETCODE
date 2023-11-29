import java.util.List;

public class euclerian {
	 public int isEulerCircuit(int v, List<Integer>[] adj) 
	    {
	        // code here
	        int e=0;
	        int o=0;
	        for(int i=0;i<v;i++){
	            if(adj[i].size()%2==0)e++;
	            else o++;
	        }
	        return e==v?2:(o>0&&o==2)?1:0;
	    }
}
