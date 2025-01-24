
public class reverse_order_of_words_2_cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Reverse2("danihs ids a boy"));

	}

	static String Reverse(String s) {

		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i] + " ");
		}
		return sb.toString().trim();

	}

	static String Reverse2(String s) {

		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String a : arr) {
			sb.append(Reverse3(a) + " ");
		}
		return sb.toString().trim();

	}

	static String Reverse3(String a) {
		String s = "";
		for (char c : a.toCharArray()) {
			s = c + s;
		}
		
		return s;
	}

}
