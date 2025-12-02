package functional_interface_with_lambda.Example1.NoParameter_NoReturnType;

public class Demo1 {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello Kajal!");
        g.say();
    }
}

//-->>Use Case: Logging, notifications, simple commands.