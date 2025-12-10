package streams.sum.Example5.OrderItems;
import java.util.*;

class SumExample5 {
    public static void main(String[] args) {
        List<Product> cart = Arrays.asList(new Product("Pen", 3), new Product("Notebook", 2), new Product("Pencil", 5));
        int totalQuantity = cart.stream().mapToInt(p -> p.quantity).sum();
        System.out.println("Total Items = " + totalQuantity);
    }
}
