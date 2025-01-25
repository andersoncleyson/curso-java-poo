package Section9.test;

import Section9.domain.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        String name = sc.nextLine();

        System.out.printf("Price: ");
        double price = sc.nextDouble();

        System.out.printf("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);
        System.out.println();

        System.out.printf("Enter the number of products to be added in stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);

        System.out.println();
        System.out.println(product);
        System.out.println();

        System.out.printf("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println();
        System.out.println(product);

        sc.close();

    }
}
