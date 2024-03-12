package array;

public class Fibonacci {
    public static long[] fibonacci(int n) {

        long[] fib = new long[n];
        for (int i = 0; i < n; i++) {
            if (n == 0) {
                fib[i] = 0;
            } else if (i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

        }

        return fib;
    }


}
