import java.util.function.BiPredicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (x,y) -> x%2==0 && y%2==0;
        System.out.println(biPredicate.test(2,4));

        BiPredicate<String ,String> biPredicate1 = (str1,str2) -> str1.length()==str2.length();
        System.out.println(biPredicate1.test("peter","harrydrhdf"));

        BiPredicate<String ,Integer> biPredicate2 = (str3,x) -> str3.length()==x;
        System.out.println(biPredicate2.test("peter",5));
    }
}