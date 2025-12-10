package streams.avg.Example3.StudentsMarks;
import java.util.*;

class AvgExample3 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kajal", 85), new Student("Rahul", 90), new Student("Aman", 75));
        double avgMarks = students.stream().mapToInt(s -> s.marks).average().getAsDouble();
        System.out.println("Average Marks = " + avgMarks);
    }
}
