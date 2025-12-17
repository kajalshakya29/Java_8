package streams.allMatch.Example2.CapitalLetter;
import java.util.*;

public class AllMatchExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Kajal", "Hello");
        boolean result = words.stream().allMatch(w -> Character.isUpperCase(w.charAt(0)));
        System.out.println(result);
    }
}
