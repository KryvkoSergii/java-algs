package ua.ksa.algo.sort;

import java.util.Comparator;

public final class BabbleSort {

    private BabbleSort() {
    }

    public static void sortNaturalOrder(final long[] array) {
        perform(array, Comparator.naturalOrder());
    }

    public static void sortReverseOrder(final long[] array) {
        perform(array, Comparator.reverseOrder());
    }

    private static void perform(final long[] array, Comparator<Long> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) >= 0) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
