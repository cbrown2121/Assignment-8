import java.util.Scanner;

public class FibonacciNumbers {

    private static long[] Cache;
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Please enter the fibonacci value would you like to view: ");
        n = scanner.nextInt();

        Cache = new long[n+1];

        System.out.println(fibonacci(n));

        scanner.close();
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (Cache[n] != 0) {
            return Cache[n];
        }

        long nthFibonacci = (fibonacci(n-1) + fibonacci(n-2));
        Cache[n] = nthFibonacci;
        return nthFibonacci;
    }
}