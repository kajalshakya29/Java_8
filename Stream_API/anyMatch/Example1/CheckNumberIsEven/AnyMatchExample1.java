package streams.anyMatch.Example1.CheckNumberIsEven;
import java.util.*;
public class AnyMatchExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 7, 8, 11);
        boolean result = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(result);
    }
}
