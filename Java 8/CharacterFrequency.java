import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "hello world";

        Map<Character, Long> characterFrequency = inputString.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Frequencies: " + characterFrequency);
    }
}
