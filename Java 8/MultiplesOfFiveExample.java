import java.util.Arrays;
import java.util.List;

public class MultiplesOfFiveExample {
    public static void main(String[] args) {
        
        List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5,6,89,9,37,39,40,55);

        
        listOfIntegers.stream()
                    .filter(i -> i % 5 == 0)
                    .forEach(System.out::println);
    }
}