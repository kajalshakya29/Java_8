import java.util.function.BiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> biFunction = (x,y)->x.length()+y.length();
        System.out.println(biFunction.apply("hello","hi"));
    }
}