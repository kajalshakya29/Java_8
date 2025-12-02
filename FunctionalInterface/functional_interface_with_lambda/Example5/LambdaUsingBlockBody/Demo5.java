package functional_interface_with_lambda.Example5.LambdaUsingBlockBody;

public class Demo5 {
    public static void main(String[] args) {
        LengthFinder f = (str) -> {
            System.out.println("Calculating length...");
            return str.length();
        };
        System.out.println(f.getLength("Kajal"));
    }
}

//--->>Use Case: String processing in search engines, recommendation systems.

/*
1. Sorting Lists (Name, Salary, Age, Marks)
2. Filtering Data (Database)
3. Searching Words (String Processing)
4. Event Handling (Button Click in GUI)
5. Multithreading (Background Task)
6. Mathematical Calculations (Billing, EMI)
7. Custom Validation (Password, Email, Age)
8. Logging (Debug / Error Logs)
9. Mapping Data (Convert One Form to Another)
10. Reduce Operation (Total, Average, Sum)
*/