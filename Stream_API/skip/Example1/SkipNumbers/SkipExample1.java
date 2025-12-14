package streams.skip.Example1.SkipNumbers;
import java.util.*;
import java.util.stream.*;

public class SkipExample1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result = nums.stream().skip(2).collect(Collectors.toList());
        System.out.println(result);
    }
}
