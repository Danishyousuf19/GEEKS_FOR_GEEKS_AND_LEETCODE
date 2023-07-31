
public class first_missing_positive {
	public int firstMissingPositive(int[] a) {
		int i = 0;
		while (i < a.length) {
			int c = a[i] - 1;
			if (a[i] > 0 && a[i] <= a.length && a[c] != a[i]) {
				s(a, i, c);
			} else {
				i++;
			}
		}
		for (int k = 0; k < a.length; k++) {
			if (a[k] != k + 1) {
				return k + 1;
			}

		}
		return a.length+1;

	}

	static void s(int a[], int i, int o) {
		int t = a[i];
		a[i] = a[o];
		a[o] = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
