
public class longest_subString {
	public int longestkSubstr(String s, int k) {
		int max = 0;
		int c = 0;
		int l = 0;
		int freq[] = new int[128];
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i)] == 0) {
				c++;

			}
			freq[s.charAt(i)]++;
			while (c > k) {
				freq[s.charAt(l)]--;
				if (freq[s.charAt(l)] == 0) {
					c--;
				}
				l++;
			}
			max = Math.max(max, i - l + 1);

		}
		return max >= k ? max : -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
