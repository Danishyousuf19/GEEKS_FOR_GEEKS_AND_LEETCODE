import java.util.Arrays;

public class seperate_neg_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 2, -4, 3, 3, 5, -5, 3, -6, -7 };
		int n = 0, p = arr.length-1;
		while (n < p) {
			while (arr[n] < 0 && n < p)
				n++;
			while (arr[p] >= 0 && n < p)
				p--;
			if (n < p) {
				int t = arr[p];
				arr[p] = arr[n];
				arr[n] = t;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
