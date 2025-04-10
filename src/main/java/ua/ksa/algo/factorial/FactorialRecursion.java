package ua.ksa.algo.factorial;

public final class FactorialRecursion {

    private FactorialRecursion() {
    }

    public static long getFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }

}
