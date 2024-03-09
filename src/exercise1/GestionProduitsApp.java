package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        List<Produit> products = new ArrayList<>();

        // Add a product to the list
        products.add(new Produit(1, "Laptop", 1200));
        products.add(new Produit(2, "Smartphone", 800));
        products.add(new Produit(3, "Tablet", 500));
        products.add(new Produit(4, "Smartwatch", 300));
        products.add(new Produit(5, "Headphones", 200));

        //Remove product from the list by index
        products.remove(2);
        products.remove(1);

        //Display the list of products
        products.forEach(System.out::println);

        //Update a product by index
        products.set(0, new Produit(1, "Laptop", 1500));
        products.set(1, new Produit(2, "Smartphone", 900));

        //Search for a product by index
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id: ");
        int product_id = scanner.nextInt();
        try {
            System.out.println(products.get(product_id));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Product not found");
        }

    }
}
