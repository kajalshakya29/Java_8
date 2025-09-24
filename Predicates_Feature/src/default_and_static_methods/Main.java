package default_and_static_methods;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
        Predicate<String> endsWithLetterL=x->x.toLowerCase().charAt(x.length()-1)=='l';

        //-----and
        Predicate<String> and=startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("vipin"));

        //-----or
        Predicate<String> or=startsWithLetterV.or(endsWithLetterL);
        System.out.println(or.test("vipul"));

        //-----negate
        System.out.println(startsWithLetterV.negate().test("peter"));

        //----isEqual----(static)
        Predicate<Object>predicate=Predicate.isEqual("Harry");
        System.out.println(predicate.test("xyz"));
        System.out.println(predicate.test("Harry"));
    }


}
