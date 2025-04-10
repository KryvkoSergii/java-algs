package ua.ksa.algo.factorial;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ForkJoinPool;

import static org.junit.jupiter.api.Assertions.*;

class FactorialForkJoinTest {

    @Test
    public void verifyFibonacciRecursionIf0() {
        long result;
        try(var pool = new ForkJoinPool()){
            result = pool.invoke(new FactorialForkJoin(0));
        }

        assertEquals(1, result);
    }

    @Test
    public void verifyFibonacciRecursionIfMoreThenOne() {
        long result;

        try(var pool = new ForkJoinPool()){
            result = pool.invoke(new FactorialForkJoin(10));
        }

        assertEquals(3_628_800, result);
    }

}