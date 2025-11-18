package comparator_in_lambda;

import java.util.Set;
import java.util.TreeSet;

public class Comparator_Using_TreeSet {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(5);
        System.out.println("Before manual sorting : " + s);
        Set<Integer> ss=new TreeSet<>((a,b)->b-a);//b-a for descending
        ss.add(22);
        ss.add(1);
        ss.add(5);
        System.out.println("After manual sorting : " + ss);
    }
}
