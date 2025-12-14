package streams.skip.Example4.SkipRandomNumber;
import java.util.*;
import java.util.stream.*;

public class SkipExample4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 9, 11, 14, 20, 25);
        List<Integer> result = nums.stream().skip(2).collect(Collectors.toList());
        System.out.println(result);
    }
}
