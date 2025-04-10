package ua.ksa.algo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sortNaturalOrder() {
        long[] array = {-4, 10, 2, 15, -3};
        InsertionSort.sortNaturalOrder(array);
        assertArrayEquals(new long[]{-4, -3, 2, 10, 15}, array);
    }

    @Test
    void sortReverseOrder() {
        long[] array = {-4, 10, 2, 15, -3};
        InsertionSort.sortReverseOrder(array);
        assertArrayEquals(new long[]{15, 10, 2, -3, -4}, array);
    }

}