package Section9.domain;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    @Override
    public String toString() {
        return "Product data: " + this.name +
                ", $ " + String.format("%.2f", this.price) +
                ", " + this.quantity + " units, " +
                "Total: $ " + String.format("%.2f", totalValueInStock());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    
}
