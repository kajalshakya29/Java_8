package functional_interface_with_lambda.Example4.ReturningBoolean;

public class Demo4 {
    public static void main(String[] args) {
        CheckAge check = (age) -> age >= 18;
        System.out.println(check.isAdult(16));
        System.out.println(check.isAdult(20));
    }
}

//--->>Use Case: Validation (age, salary, login attempts…)