package streams.anyMatch.Example2.WordStarts;
import java.util.*;
public class AnyMatchExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "apple", "python", "mongo");
        boolean result = words.stream().anyMatch(w -> w.startsWith("z"));
        System.out.println(result);
    }
}
