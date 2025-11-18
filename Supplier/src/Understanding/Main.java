package Understanding;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        MySupplier<String>mySupplier=()->"this is the data i am returning";
        System.out.println(mySupplier.get());
    }

}
