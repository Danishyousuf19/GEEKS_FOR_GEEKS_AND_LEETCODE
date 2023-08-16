import java.util.*;

public class sliding_window {
	 public int[] maxSlidingWindow(int[] arr, int k) {
		    int n = arr.length;
		    int res[]=new int[n-k+1];
		Deque <Integer> arr_idx_of_three_set=new ArrayDeque<>();
		for(int i=0;i<n;i++){
		    while(!arr_idx_of_three_set.isEmpty()&&arr_idx_of_three_set.peekFirst()<i-k+1){
		        arr_idx_of_three_set.pollFirst();
		    }
		     while(!arr_idx_of_three_set.isEmpty()&&arr[ arr_idx_of_three_set.peekLast()]<arr[i]){
		        arr_idx_of_three_set.pollLast();
		    }
		     arr_idx_of_three_set.offer(i);
		     if(i>=k-1)
		     res[i-k+1]=arr[ arr_idx_of_three_set.peekFirst()];

		}
		return res;
		    }
}
