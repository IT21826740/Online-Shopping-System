package Q3;

import java.util.ArrayList;

public class Order {
   private int orderID;
   private Customer customer;
   private ArrayList<Product> products;
  
   public Order(int orderID, Customer customer) {
    this.orderID = orderID;
    this.customer = customer;
    this.products = new ArrayList<>();
}
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalCost(){
        double totalCost =0;
        for (Product product : products ){
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void displayOrderDetails(){
        System.out.println("Customer: " + customer.getName() + "   Email: "+ customer.getEmail());
        System.out.println("Order ID: "+ orderID);
        System.out.println("Products in the order: ");
        for(Product product: products){
            System.out.println(product.getProductDetails());
        }
        System.out.println("Total Order cost: $"+calculateTotalCost());
    }

}
