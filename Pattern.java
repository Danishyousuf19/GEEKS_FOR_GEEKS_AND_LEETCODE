public class Pattern {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the pattern
        printPattern(n);
    }

    public static void printPattern(int n) {
        // Print the upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

