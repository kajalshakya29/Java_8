package streams.filter.Example5.FilterProducts;
import java.util.*;
import java.util.stream.*;

public class FilterExample5 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product(1, "Pen", 50), new Product(2, "Notebook", 120), new Product(3, "Earphones", 499), new Product(4, "Power Bank", 1200), new Product(5, "Water Bottle", 300));
        List<Product> budgetItems = products.stream().filter(p -> p.price < 500).collect(Collectors.toList());
        for(Product p : budgetItems){
            System.out.println(p.name + " : " + p.price);
        }
    }
}
