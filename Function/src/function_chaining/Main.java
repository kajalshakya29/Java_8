package function_chaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//------ASSIGNING WORK ---------
public class Main {
    public static void main(String[] args) {
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0,3);

        System.out.println(function1.andThen(function2).apply("Peter"));
        Function<Integer,Integer>function3=i->i*2;
        Function<Integer,Integer>function4=i->i*i*i;

        System.out.println(function3.andThen(function4).apply(2));
        System.out.println(function4.andThen(function3).apply(2));
        System.out.println(function3.compose(function4).apply(2));

        Function<Integer,Integer>function5=Function.identity();//--->call by interface name
    }
}
