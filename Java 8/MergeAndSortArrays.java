import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1};
        int[] b = {8, 3, 6, 4};

        int[] mergedSortedArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                                            .sorted().toArray();
        System.out.println(Arrays.toString(mergedSortedArray));
    }
}