package streams.allMatch.Example1.EvenNo;
import java.util.*;

public class AllMatchExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 6, 8);
        boolean result = nums.stream().allMatch(n -> n % 2 == 0);
        System.out.println(result);
    }
}
