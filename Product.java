package Q3;

public class Product {
   private int productID;
   private String name;
   private double price;

public Product(int productID,String name,double price){
    this.productID=productID;
    this.name=name;
    this.price=price;
}

public int getProductID() {
    return productID;
}

public String getName() {
    return name;
}

public double getPrice() {
    return price;
}

public void setProductID(int productID) {
    this.productID = productID;
}

public void setName(String name) {
    this.name = name;
}

public void setPrice(double price) {
    this.price = price;
}

public String getProductDetails(){
    return name + "- $ " +price; 
}
    
}
