import java.util.Arrays;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 2, 3, 5 };
		merge(a, 0, 4);
		System.out.println(Arrays.toString(a));
	}

	static void merge(int arr[], int s, int e) {
		if (s < e) {
			int mid = (s + e) / 2;
			merge(arr, s, mid);
			merge(arr, mid + 1, e);
			mergethem(arr, s, mid, e);
		}
	}

	static void mergethem(int arr[], int s, int m, int e) {
		int t[] = new int[e - s + 1];
		int i = s;
		int j = m + 1;
		int k = 0;
		while (i <= m && j <= e) {
			if (arr[i] < arr[j])
				t[k++] = arr[i++];
			else {
				t[k++] = arr[j++];
			}

		}
		while (i <= m) {
			t[k++] = arr[i++];
		}
		while (j <= e) {
			t[k++] = arr[j++];
		}
		i = s;
		for (j = 0; j < k; j++) {
			arr[i++] = t[j];
		}
	}

	static int divide(int arr[], int s, int e) {
	    int c = 0;
	    if (s < e) {
	        int mid = (s + e) / 2;
	        c += divide(arr, s, mid);
	        c += divide(arr, mid + 1, e);
	        c += conquer(arr, s, mid, e);
	    }
	    return c;
	}

	static int conquer(int a[], int s, int m, int e) {
	    int c = 0;
	    int l[] = new int[m - s + 1];
	    int r[] = new int[e - m];
	    for (int i = 0; i < l.length; i++) {
	        l[i] = a[s + i];
	    }
	    for (int i = 0; i < r.length; i++) {
	        r[i] = a[m + 1 + i];
	    }
	    int k = s, i = 0, j = 0;

	    while (i < l.length && j < r.length) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        } else {
	            a[k++] = r[j++];
	            c += (m + 1) - s + i;
	        }
	    }
	    while (i < l.length) {
	        a[k++] = l[i++];
	    }
	    while (j < r.length) {
	        a[k++] = r[j++];
	    }
	    return c;
	}

}
