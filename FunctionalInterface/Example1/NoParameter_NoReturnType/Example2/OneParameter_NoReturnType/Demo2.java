package functional_interface_with_lambda.Example2.OneParameter_NoReturnType;

public class Demo2 {
    public static void main(String[] args) {
        Message m = (msg) -> System.out.println("Message: " + msg);
        m.showMessage("Java is awesome!");
    }
}

//--->>Use Case: Printing user message, error logs, monitoring systems.