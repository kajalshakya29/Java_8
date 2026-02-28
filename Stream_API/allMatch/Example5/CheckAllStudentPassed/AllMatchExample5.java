package streams.allMatch.Example5.CheckAllStudentPassed;
import java.util.*;

public class AllMatchExample5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kajal", 90), new Student("Rohit", 45), new Student("Priya", 75));
        boolean result = students.stream().allMatch(s -> s.marks >= 33);
        System.out.println(result);
    }
}
