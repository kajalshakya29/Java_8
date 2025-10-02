import java.util.function.BiConsumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer= (x,y)-> System.out.println(x+y);
        biConsumer.accept(2,4);
    }
}