package ua.ksa.algo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sortNaturalOrder() {
        long[] array = {-4, 10, 2, 15, -3};
        var actual = QuickSort.sortNaturalOrder(array);
        assertArrayEquals(new long[]{-4, -3, 2, 10, 15}, actual);
    }

    @Test
    void sortReverseOrder() {
        long[] array = {-4, 10, 2, 15, -3};
        var actual = QuickSort.sortReverseOrder(array);
        assertArrayEquals(new long[]{15, 10, 2, -3, -4}, actual);
    }

}