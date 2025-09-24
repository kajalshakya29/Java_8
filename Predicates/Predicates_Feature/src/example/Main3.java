package example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
       // Predicate<Integer> isEven= x->x%2==0;
       Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
       System.out.println(startsWithLetterV.test("hello"));
    }
}
