import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseSortExample {
    public static void main(String[] args) {
        List<Integer> anyList = Arrays.asList(5, 3, 8, 1, 4);
        
        anyList.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
    }
}