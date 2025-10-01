import java.util.function.BinaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator=(str1,str2)->str1+str2;
        System.out.println(binaryOperator.apply("hello","world"));
    }
}