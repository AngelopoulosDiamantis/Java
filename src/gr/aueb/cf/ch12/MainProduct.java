package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Product;

/**
 * Demonstrates the usage of {@link gr.aueb.cf.ch12.model.Product}
 */
public class MainProduct {
    public static void main(String[] args) {

        //populate
        Product oranges = new Product(1, "Oranges", "Yellow Oranges", 6.99, 100, true);

        //set changes
        oranges.setPrice(5.99);
        oranges.setQuantity(80);

        System.out.println("Product Name " + oranges.getName());
        System.out.println("Price " + oranges.getPrice());

    }
}
