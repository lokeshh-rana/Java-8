import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(5, 3, 8, 1, 2, 7, 6, 9, 0, 4);

        System.out.println("Three Minimum Numbers:");
        listOfIntegers.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Three Maximum Numbers:");
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}