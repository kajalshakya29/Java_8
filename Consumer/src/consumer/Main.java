package consumer;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; //------>> IT HAS SINGLE ABSTRACT METHOD, IT CONSUMES AND DO NOT HAVE ANY RETURN TYPE
                                    //---->> USE CASE-> WHEN YOU WANT TO SAVE ANY DATA INTO DATABASE
public class Main {
    public static void main(String[] args) {
        Consumer <String> consumer = s-> System.out.println(s);
        //consumer.accept("Peter");

        Consumer<Integer> consumer1 = i-> System.out.println(i*i*1000);
        //consumer1.accept(100);

        Consumer<List<Integer>> consumer2 = li->{
          for (Integer i : li){
              System.out.println(i+100);
          }
        };
        //consumer2.accept(Arrays.asList(1,2,3,4,5));

        Consumer<List<Integer>> consumer3=lii->{
            for (Integer i : lii){
                System.out.println(i);
            }
        };
        //consumer3.accept(Arrays.asList(1,2,3,4,5,6,7));
        Consumer<List<Integer>> consumer4=consumer3.andThen(consumer2);
        consumer4.accept(Arrays.asList(1,2,3,4,5,6,7));
    }
}