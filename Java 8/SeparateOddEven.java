import java.util.*;
import java.util.stream.Collectors;

public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitionedNumbers = listOfIntegers.stream()
            .collect(Collectors.partitioningBy(i -> i % 2 != 0));

        List<Integer> oddNumbers = partitionedNumbers.get(true);
        List<Integer> evenNumbers = partitionedNumbers.get(false);

        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
    }
}