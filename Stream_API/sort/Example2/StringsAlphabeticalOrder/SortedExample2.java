package streams.sort.Example2.StringsAlphabeticalOrder;
import java.util.*;

class SortedExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kajal", "Aman", "Rahul", "Pooja");
        List<String> sortedNames = names.stream().sorted().toList();
        for(String name : sortedNames){
            System.out.println(name);
        }
    }
}
