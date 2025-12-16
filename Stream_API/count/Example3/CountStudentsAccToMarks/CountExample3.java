package streams.count.Example3.CountStudentsAccToMarks;
import java.util.*;

class CountExample3 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kajal", 85), new Student("Rahul", 70), new Student("Aman", 92), new Student("Pooja", 60));
        long passed = students.stream().filter(s -> s.marks > 80).count();
        System.out.println(passed);
    }
}
