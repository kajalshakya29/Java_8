package comparator_in_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Understanding_Comparator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(0);
        list.add(99);
        list.add(6);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,(a,b)->b-a);//WORKING ACCORDING TO US
        System.out.println(list);
    }
}
