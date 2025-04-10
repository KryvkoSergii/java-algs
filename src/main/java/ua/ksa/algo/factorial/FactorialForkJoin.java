package ua.ksa.algo.factorial;

import java.util.concurrent.RecursiveTask;

public class FactorialForkJoin extends RecursiveTask<Long> {
    private static final int THRESHOLD = 3;

    private final int start;
    private final int end;

    public FactorialForkJoin(final int end) {
        this.start = 1;
        this.end = end;
    }

    public FactorialForkJoin(final int start, final int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            return getFactorial(start, end);
        }

        int mid = (start + end) / 2;
        var left = new FactorialForkJoin(start, mid);
        var right = new FactorialForkJoin(mid + 1, end);

        left.fork();
        long rightResult = right.compute();
        long leftResult = left.join();

        return leftResult * rightResult;
    }

    private long getFactorial(int start, int end) {
        long result = 1;
        for (int i = start; i <= end; i++) {
            result *= i;
        }
        return result;
    }
}
