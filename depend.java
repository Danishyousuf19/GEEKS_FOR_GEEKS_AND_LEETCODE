import java.util.ArrayList;

public class depend {
	 int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
	        // code here
	        int x=0;
	        for(int i=0;i<adj.size();i++){
	            x+=adj.get(i).size();
	        }
	        return x;
	    }
}
