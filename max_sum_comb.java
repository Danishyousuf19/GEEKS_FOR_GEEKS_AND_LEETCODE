import java.util.*;

public class max_sum_comb {
	static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
		List<Integer> list = new ArrayList<>();
		  Arrays.sort(A);
	       Arrays.sort(B);
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = N - 1; i > N - K - 1; i--) {
			for (int j = N - 1; j > N - K - 1; j--) {
				int n = A[i] + B[j];
				if (q.size() < K) {
					q.add(n);
				} else {
					if (q.peek() < n) {
						q.poll();
						q.add(n);

					} else
						break;
				}
			}
		}
		while (!q.isEmpty()) {
			if (list.isEmpty())
				list.add(q.poll());
			else {
				list.add(0, q.poll());
			}
		}
		return list;
	}
}
