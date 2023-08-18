import java.util.*;

public class maximum_network_rank_fof_roads {
	 public int maximalNetworkRank(int n, int[][] roads) {
		 int degrees[]=new int [n];
		 Set<String>connection=new HashSet<>();
		 for(int road[]:roads ) {
			 degrees[road[0]]++;
			 degrees[road[1]]++;
			 connection.add(road[0]+","+road[1]);
			 connection.add(road[1]+","+road[0]);
		 }
		 int max_network=0;
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 int road_network=degrees[i]+degrees[j];
				 if(connection.contains(i+","+j)) {
					 road_network--;
				 }
				 max_network=Math.max(max_network, road_network);
			 }
		 }
		 
		 
		 return max_network;
	 }
}
