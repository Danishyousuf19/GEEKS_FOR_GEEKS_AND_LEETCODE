import java.util.ArrayList;
import java.util.function.Predicate;

@FunctionalInterface
interface FunctionInterface {
	boolean iseven(int n);
}

@FunctionalInterface
interface FunctionInterface2 {
	void print();
}

@FunctionalInterface
interface FunctionInterface3<T> {
	T fun(T t);
}

public class LambdaFunc {
	public static void main(String a[]) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("OR BBSR");
		arr.add("OD BBSR");
		arr.stream().filter((b) -> b.startsWith("OD")).forEach((p) -> System.out.println(p));
		arr.forEach(System.out::println);
		Predicate<String> ss = (s) -> s.startsWith("OR");
		filter(arr, ss);
		arr.stream().map((x) -> x + "hi").forEach(System.out::println);
		FunctionInterface ref = (int n) -> {
			return n % 2 == 0;
		};

		boolean result = ref.iseven(5);
		System.out.println("Result: " + result);

		ref = (n) -> (n % 2) == 0;
		System.out.println("Result: " + ref.iseven(6));

		FunctionInterface2 ref2;
		ref2 = () -> {
			System.out.println("hi ✋ ");
		};
		ref2.print();
		FunctionInterface3<String> ref3 = (s) -> {
			String r = "";
			for (int i = s.length(); i >= 0; i--)
				r += s.charAt(i);
			return s;
		};
		FunctionInterface3<Integer> ref4 = (s) -> {
			int r = 0;
			while (s != 0) {
				r = r * 10 + s % 10;
				s /= 10;
			}
			return r;
		};
		System.out.println(ref4.fun(475));
	}

	public static void filter(ArrayList<String> loc, Predicate<String> p) {
		for (String a : loc) {
			if (p.test(a)) {
				System.out.println(a);
			}
		}
	}
}
