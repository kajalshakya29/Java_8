import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//---->>> JAB HUME FUNCTION KO AS A PARAMETER
// DENA HO TAB HUM METHOD REFERENCE USE KRTE HAI IN PLace OF LAMBDA EXPRESSION
//------LAMBDA EXPRESSION TAB HI REPLACE KRNA HAI JAB AGAR
// METHOD ALREADY KAHIN PAR HAI LIKKHA HUA


public class Main {

    public void display(String s){
        System.out.println(s);
    }

    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Main main=new Main();
        List<String> students = Arrays.asList("Alice","Peter", "Bob");
        students.forEach(Main::print);
        students.forEach(main::display);
    }
}