package introducaoPOO.test;

import introducaoPOO.domain.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Product product = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        product.name = sc.nextLine();

        System.out.printf("Price: ");
        product.price = sc.nextDouble();

        System.out.printf("Quantity in stock: ");
        product.quantity = sc.nextInt();

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
