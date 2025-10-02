import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        List<String> names = Arrays.asList("Alice","Peter", "Bob");
        names.stream().map(Student::new).collect(Collectors.toList());
    }
}