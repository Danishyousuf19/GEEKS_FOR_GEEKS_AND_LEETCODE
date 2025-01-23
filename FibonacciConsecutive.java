public class FibonacciConsecutive {
    public static void main(String[] args) {
        int a = 13;
        int b = 21;

        if (areConsecutiveFibonacci(a, b)) {
            System.out.println(a + " and " + b + " are consecutive terms in the Fibonacci series.");
        } else {
            System.out.println(a + " and " + b + " are not consecutive terms in the Fibonacci series.");
        }
    }

    public static boolean areConsecutiveFibonacci(int a, int b) {
        int prev = 0;
        int curr = 1;

        while (curr < a) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }

        return (curr == a && (curr + prev) == b) || (curr == b && (curr + prev) == a);
    }
}
