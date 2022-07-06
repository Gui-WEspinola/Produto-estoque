package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.printf("Product data: %s%n%n", product);

        System.out.print("Enter the number of products to be added to stock: ");
        int quantityInput = sc.nextInt();
        product.AddProducts(quantityInput);

        System.out.printf("%nUpdated data: %s%n%n", product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantityInput = sc.nextInt();
        product.RemoveProducts(quantityInput);

        System.out.println();
        System.out.println("Updated data: " + product);
    }
}