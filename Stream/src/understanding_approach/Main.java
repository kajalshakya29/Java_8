package understanding_approach;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //IMPERATIVE APPROACH
        int[] arr={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);

        //STREAM-->declarative approach
        int[] arr2={1,2,3,4,5};
        int sum2= Arrays.stream(arr2).filter(n->n%2==0).sum();
        System.out.println(sum2);
    }
}