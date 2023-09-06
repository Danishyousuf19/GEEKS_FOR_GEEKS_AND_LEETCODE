
public class singleno {
	public int singleNumber(int[] arr) {
		int x = 0;
		for (int e : arr) {
			x ^= e;
		}
		return x;
	}
}
