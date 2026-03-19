package Ecommerce;

class Product {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Customer {

    int customerId;
    String customerName;

    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}

class Order {

    Product product;
    int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    void placeOrder() {
        System.out.println("Order placed successfully!");
    }

    double calculateTotalCost() {
        return product.price * quantity;
    }

    void displayOrder() {
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class Practical5_2 {

    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 50000);
        Customer c = new Customer(1, "Revati");
        Order o = new Order(p, 2);

        System.out.println("Customer Details");
        c.displayCustomer();

        System.out.println("\nProduct Details");
        p.displayProduct();

        System.out.println("\nOrder Details");
        o.placeOrder();
        o.displayOrder();
    }
}