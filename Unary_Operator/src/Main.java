//--->>>--IF WE HAVE SAME TYPE OF INPUTS AND OUTPUTS THEN WE WILL USE UNARY OPERATOR
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer>unaryOperator = x->x*x;
        System.out.println(unaryOperator.apply(5));

    }
}