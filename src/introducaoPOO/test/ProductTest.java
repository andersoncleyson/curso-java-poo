package introducaoPOO.test;

import introducaoPOO.domain.Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        product.name = sc.nextLine();
        System.out.printf("Price: ");
        product.price = sc.nextDouble();
        System.out.printf("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());
        System.out.println();

        System.out.printf("Enter the number of products to be added in stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);
        System.out.println();

        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());
        System.out.println();

        System.out.printf("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        System.out.println();

        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", product.name, product.price, product.quantity, product.totalValueInStock());






    }
}
