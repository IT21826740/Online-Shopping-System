package Q3;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(10, "Johon Doe", "john@example.com");
        Order order = new Order(1001, customer);
        Product product =new Electronics(1, "Laptop", 800.0,12);
        Product product2 = new Clothing(2, "T-shirt", 20.0,"M","Cotton");

        //Add products to order
        order.addProduct(product);
        order.addProduct(product2);

        order.displayOrderDetails();
       


    }
}
