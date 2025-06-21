import models.Product;
import utils.ProductGenerator;
import utils.ProductSearch;

public class App {
    public static void main(String[] args) throws Exception {
      Product[] products = ProductGenerator.generateProduct(10,false);
      Product[] sortedProducts = ProductGenerator.generateProduct(10, true);

      Product target = ProductSearch.linearSearchProductById(products, 3);
      System.out.println(target + "found using linear search");

      target = ProductSearch.linearSearchProductById(sortedProducts, 3);
      System.out.println(target + "found using binary search");
    }
}
