package ua.ksa.algo.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public final class QuickSort {

    private QuickSort() {
    }

    public static long[] sortNaturalOrder(final long[] array) {
        return perform(array, Comparator.naturalOrder());
    }

    public static long[] sortReverseOrder(final long[] array) {
        return perform(array, Comparator.reverseOrder());
    }

    private static long[] perform(final long[] array, Comparator<Long> comparator) {
        return partition(LongStream.of(array).boxed().toList(), comparator).stream()
                .mapToLong(Long::longValue)
                .toArray();
    }

    private static List<Long> partition(final List<Long> array, Comparator<Long> comparator) {
        if (array.isEmpty()) {
            return array;
        }

        final int mid = array.size() / 2;
        final long pivot = array.get(mid);

        var acc = array.stream().collect(Collectors.teeing(
                Collectors.filtering(el -> comparator.compare(el, pivot) < 0, Collectors.toList()),
                Collectors.filtering(el -> comparator.compare(el, pivot) > 0, Collectors.toList()),
                Container::new
        ));

        var result = new ArrayList<>(partition(acc.left(), comparator));
        result.add(pivot);
        result.addAll(partition(acc.right(), comparator));

        return result;
    }

    private record Container(List<Long> left, List<Long> right) {}
}

