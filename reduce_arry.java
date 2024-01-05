import java.util.*;
public class reduce_arry {
	void convert1(int[] arr, int n) {
		int[] temp = arr.clone();
		Arrays.sort(temp);
		HashMap<Integer, Integer> hm = new HashMap<>();

		int val = 0;
		for (int num : temp)
			hm.put(num, val++);
		for (int i = 0; i < n; i++)
			arr[i] = hm.get(arr[i]);
	}

	void convert(int[] arr, int n) {
		PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]>b[0]?1:-1);
			for(int i=0;i<n;i++) {
				pq.offer(new int[] {arr[i],i});
			}
			int val = 0;
	        while(!pq.isEmpty()) arr[pq.poll()[1]] = val++;
		
	}
}
