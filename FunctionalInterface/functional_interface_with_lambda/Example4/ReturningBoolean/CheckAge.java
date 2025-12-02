package functional_interface_with_lambda.Example4.ReturningBoolean;

@FunctionalInterface
interface CheckAge {
    boolean isAdult(int age);
}
