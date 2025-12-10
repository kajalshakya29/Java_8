package streams.sum.Example4.StudentMarksTotal;
import java.util.*;

class SumExample4 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("Kajal", 85), new Student("Rahul", 90), new Student("Aman", 78));
        int totalMarks = students.stream().mapToInt(s -> s.marks).sum();
        System.out.println("Total Marks = " + totalMarks);
    }
}
