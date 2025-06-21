package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import models.Product;

public class ProductGenerator {

    private static final String[] productNames = {
            "Phone", "Laptop", "Tablet", "Headphones", "Camera", "Monitor", "Keyboard", "Mouse"
    };

    private static final String[] productCategories = {
            "Electronics", "Computers", "Accessories", "Appliances"
    };

    public static Product[] generateProduct(int n, Boolean beSorted) {
        Product[] products = new Product[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            products[i] = new Product(
                    i + 1,
                    productNames[random.nextInt(productNames.length)],
                    productCategories[random.nextInt(productCategories.length)]);
        }

        if (!beSorted) {
            List<Product> productList = Arrays.asList(products);
            Collections.shuffle(productList);
            products = productList.toArray(new Product[0]);
        }
        return products;

    }
}
