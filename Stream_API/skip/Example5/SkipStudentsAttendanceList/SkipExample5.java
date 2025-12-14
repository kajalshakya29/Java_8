package streams.skip.Example5.SkipStudentsAttendanceList;
import java.util.*;
import java.util.stream.*;

public class SkipExample5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kajal", 1), new Student("Rohit", 2), new Student("Simran", 3), new Student("Priya", 4));
        List<Student> result = students.stream().skip(2).collect(Collectors.toList());
        for(Student s : result){
            System.out.println(s.name + "-" + s.roll);
        }
    }
}
