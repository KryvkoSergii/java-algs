package ua.ksa.algo.sort;

public final class InsertionSort {

    public static void sortNaturalOrder(final long[] array) {
        for (int i = 1; i < array.length; i++) {
            var key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }

    public static void sortReverseOrder(final long[] array) {
        for (int i = 1; i < array.length; i++) {
            var key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }
}
