package example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//------ASSIGNING WORK ---------
public class Understanding_Functions {
    public static void main(String[] args) {
        Function<String,Integer>function=x->x.length();
        System.out.println(function.apply("Length of this statement :"));

        Function<String,String>function2=s->s.substring(0,3);
        System.out.println();

        Function<List<Student>,List<Student>> studentsWithVipAsPrefix=li->{
            List<Student>result=new ArrayList<>();
            for (Student s: li){
                if(function2.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
            return result;
        };

        Student s1=new Student(1,"Vipin");
        Student s2=new Student(2,"Steve");
        Student s3=new Student(3,"Vipreet");
        List<Student>students= Arrays.asList(s1,s2,s3);
        List<Student>filteredStudents = studentsWithVipAsPrefix.apply(students);
        System.out.println(filteredStudents);

    }

    private static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}