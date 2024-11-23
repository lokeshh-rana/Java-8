import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 1, 2};
        int[] array2 = {7, 6, 3, 9, 0};

        int[] mergedSortedArray = mergeAndSortArrays(array1, array2);

        System.out.println("Merged and Sorted Array without Duplicates: " + Arrays.toString(mergedSortedArray));
    }

    public static int[] mergeAndSortArrays(int[] a, int[] b) {
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .distinct()
                .sorted()
                .toArray();
    }
}