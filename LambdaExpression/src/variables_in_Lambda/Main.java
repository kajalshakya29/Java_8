package variables_in_Lambda;


//THIS FILE DO NOT CONTAIN MAIN METHOD
public class Main {

    private void doSomething(){
        Employee employee=()->{
            int s=10;
            return "100";
            //System.out.println(s); unreachable statement
            //System.out.println(this.s); // NOT POSSIBLE
        };

        //-->>ANONYMOUS CLASS
        Employee employee1=new Employee() {
            int s = 10;
            @Override
            public String getSalary() {
                System.out.println(this.s);
                return "100";
            }
        };
    }

}

