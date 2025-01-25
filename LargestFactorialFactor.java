import java.util.Scanner;

public class LargestFactorialFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();

        int largestFactorial = 1;
        int factorial = 1;
        int i = 1;

        while (factorial <= n) {
            if (n % factorial == 0) {
                largestFactorial = factorial;
            }
            i++;
            factorial *= i;
        }

        System.out.println("The largest factorial factor of " + n + " is: " + largestFactorial);
    }
}
