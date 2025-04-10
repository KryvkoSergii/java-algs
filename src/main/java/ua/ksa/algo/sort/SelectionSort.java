package ua.ksa.algo.sort;

import java.util.Comparator;

public class SelectionSort {

    public static void sortNaturalOrder(final long[] array) {
        perform(array, Comparator.naturalOrder());
    }

    public static void sortReverseOrder(final long[] array) {
        perform(array, Comparator.reverseOrder());
    }

    private static void perform(final long[] array, Comparator<Long> comparator) {
        for (int i= 0; i < array.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], array[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            var temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
    }
}
