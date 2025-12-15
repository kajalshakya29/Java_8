package streams.map.Example5.StringsListToLengthOfString;
import java.util.*;
import java.util.stream.*;

public class MapExample5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "spring", "lambda", "stream");
        List<Integer> lengths = words.stream().map(w -> w.length()).collect(Collectors.toList());
        for(Integer len : lengths){
            System.out.println(len);
        }
    }
}
