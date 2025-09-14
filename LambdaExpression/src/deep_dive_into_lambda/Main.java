package deep_dive_into_lambda;

public class Main {
    public static void main(String[] args) {
        //Employee employee=new SDE();
        //System.out.println(employee.getName());

        //---****LAMBDA EXPRESSION****----
        //FUNCTIONAL INTERFACE ACT AS TYPE OF LAMBDA EXPRESSION
        Employee employee=()->"SOFTWARE ENGINEER";
        System.out.println(employee.getName());

    }
}
