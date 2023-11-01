import java.util.HashMap;

public class measure_freq {
	 public static void frequencyCount(int arr[], int N, int P)
	    {
	        // code here
		 HashMap<Integer,Integer>map=new HashMap<>();
		 for(int i=0;i<N;i++) {
			 map.put(arr[i],map.getOrDefault(arr[i], 1)+1 );
		 }
		 for(int i=0;i<N;i++) {
			 if(!map.containsKey(i+1)) {
				 arr[i]=0;
			 }
			 else {
				 arr[i]=map.get(i+1);
			 }
		 }
	    }
	 
}
