package streams.flatMap.Example5;
import java.util.*;

class Student {
    String name;
    List<String> courses;

    Student(String name, List<String> courses){
        this.name = name;
        this.courses = courses;
    }
}

class FlatMapExample5 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Kajal", Arrays.asList("Java", "SQL")), new Student("Rahul", Arrays.asList("Python")), new Student("Aman", Arrays.asList("JavaScript", "HTML")));
        List<String> allCourses = students.stream().flatMap(s -> s.courses.stream()).toList();
        System.out.println(allCourses);
    }
}
