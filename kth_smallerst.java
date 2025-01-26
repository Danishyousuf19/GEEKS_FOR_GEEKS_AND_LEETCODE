import java.util.Arrays;
import java.util.PriorityQueue;

public class kth_smallerst {

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			// Partition the array around a pivot
			int partitionIndex = partition(arr, l, r);

			// If the partition index is the Kth element, return it
			if (partitionIndex - l == k - 1)
				return arr[partitionIndex];

			// If the partition index is greater than K, recursively search in the left
			// subarray
			if (partitionIndex - l > k - 1)
				return kthSmallest(arr, l, partitionIndex - 1, k);

			// Otherwise, recursively search in the right subarray
			return kthSmallest(arr, partitionIndex + 1, r, k - partitionIndex + l - 1);
		}

		// If K is out of range, return -1 or throw an exception to handle the error
		return -1;
	}

	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l;

		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= pivot) {
				swap(arr, i, j);
				i++;
			}
		}

		swap(arr, i, r);
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingPQ();
		int as[] = { 1, 13, 34, 4, 31, 2, 23, 234, 4 };
		
		int x=Using_QuickSelect(as, 3, 0, as.length-1);
	System.out.println(x);
	}

	private static int Using_QuickSelect(int arr[],int k,int l,int h) {
	int p=Partition(arr, l, h);
	if(p==k-1)return arr[p];
	else if(p<k-1)
		return Using_QuickSelect(arr, k, p+1, h);
	else
	
	return Using_QuickSelect(arr, k, l, p-1);

	}

	static int Partition(int arr[], int low, int high) {

		int p = arr[high];
		int pi = low;
		for (int i = low; i <= high; i++) {
			if (arr[i] < p) {
				swap(arr, pi, i);
				pi++;
			}
		}
		swap(arr, pi, high);
		return pi;

	}

	private static void UsingPQ() {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
		int k = 3;
		int as[] = { 1, 13, 34, 4, 31, 2, 23, 234, 4 };
		for (int i : as) {
			q.offer(i);
			if (q.size() > k) {
				q.poll();
			}
		}
		System.out.println(q.peek());
	}

}
