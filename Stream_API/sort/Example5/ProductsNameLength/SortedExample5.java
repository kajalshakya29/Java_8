package streams.sort.Example5.ProductsNameLength;
import java.util.*;

class SortedExample5 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Pen", 20), new Product("Notebook", 50), new Product("Bag", 700), new Product("Bottle", 120));
        List<Product> sortedByLength = products.stream().sorted((p1, p2) -> p1.name.length() - p2.name.length()).toList();
        for(Product p : sortedByLength){
            System.out.println(p.name + " : " + p.name.length());
        }
    }
}
