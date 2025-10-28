package parallel_stream;


import java.util.Arrays;
import java.util.List;

//------IF WE HAVE LARGE ARRAY OF ELEMENTS THEN IT WILL BE SUITABLE TO APPLY OR USE PARALLEL STREAM
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list.parallelStream();
        System.out.println(list);
    }
}
