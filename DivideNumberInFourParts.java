public class DivideNumberInFourParts {

    public static void main(String[] args) {
        // Example inputs
        int n1 = 5;
        int n2 = 6;
        int n3 = 8;

        System.out.println("Ways to divide " + n1 + " in 4 parts: " + countWays(n1));
        System.out.println("Ways to divide " + n2 + " in 4 parts: " + countWays(n2));
        System.out.println("Ways to divide " + n3 + " in 4 parts: " + countWays(n3));
    }

    // Function to count the number of ways
    public static int countWays(int n) {
        // Check if n is less than 4, as we need at least 1 for each part
        if (n < 4) {
            return 0;
        }

        // Adjust n by subtracting 4 to account for positive integers
        int adjustedN = n - 4;

        // Calculate the combination C(adjustedN + 3, 3)
        return combination(adjustedN + 3, 3)/(n-1);
    }

    // Function to calculate combination C(n, r)
    public static int combination(int n, int r) {
        if (r > n) {
            return 0;
        }
        
        // Calculate n! / (r! * (n - r)!)
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }

        return (int) result;
    }
}
