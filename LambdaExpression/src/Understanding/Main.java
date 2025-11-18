package Understanding;

public class Main{
    public static void main(String[] args) {

        StringProcessor lengthCalculater=(input)->input.length();
//    @Override
//    public int process(String input) {
//        return 0;
//    }
        int result = lengthCalculater.process("Hello java");
        System.out.println(result);
    }
}
