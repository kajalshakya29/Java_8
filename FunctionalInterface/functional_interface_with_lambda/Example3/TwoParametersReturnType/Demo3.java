package functional_interface_with_lambda.Example3.TwoParametersReturnType;

public class Demo3 {
    public static void main(String[] args) {
        Calculator c = (a,b) -> a+b;
        System.out.println("Sum = " + c.add(10, 20));
    }
}
//-->>>Use Case: Calculations in billing system, bank app, game scoring.