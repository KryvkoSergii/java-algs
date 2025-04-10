package ua.ksa.algo.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialRecursionTest {

    @Test
    public void verifyFibonacciRecursionIf0() {

        var result = FactorialRecursion.getFactorial(0);
        assertEquals(1, result);
    }

    @Test
    public void verifyFibonacciRecursionIfMoreThenOne() {
        var result = FactorialRecursion.getFactorial(10);
        assertEquals(3_628_800, result);
    }

}