package comparator_in_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Example{
    public static void main(String[] args) {
        Student s1=new Student(2,"Peter");
        Student s2=new Student(3,"Harry");
        Student s3=new Student(33,"Steve");
        List<Student>li=new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        Collections.sort(li,(a,b)->b.id-a.id);
        System.out.println(li);
    }
}


class Student {
    public Integer id;
    public String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+": "+this.name;
    }
}
