import java.util.Arrays;
import java.util.Comparator;

public class large_no {
	String printLargest(int n, String[] arr) {
		String a = "";
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String x, String y) {
				return (y + x).compareTo(x + y);
			}
		});
		for (String d : arr) {
			a = a + d;
		}
		return a;

	}

}
