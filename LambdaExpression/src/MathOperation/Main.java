package MathOperation;

public class Main {
    public static void main(String[] args) {
        MathOperation customOperation=(a,b)->{
            int sum=a+b;
            return sum*2;
        };
        int result=customOperation.operate(2,5);
        System.out.println(result);
    }
}
