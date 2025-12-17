package streams.anyMatch.Example5.CheckIfAnyStudentFailed;
import java.util.*;

public class AnyMatchExample5 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("Kajal", 90), new Student("Rohit", 20), new Student("Priya", 75));
        boolean result = list.stream().anyMatch(s -> s.marks < 33);
        System.out.println(result);
    }
}
