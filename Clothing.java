package Q3;

public class Clothing extends Product{
   private String size;
   private String material;

   public Clothing(int productID, String name, double price,String size, String material) {
        super(productID, name, price);
        this.material=material;
        this.size=size;

    }
    

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getProductDetails() {
        return super.getProductDetails()+"  size - " + size + "  material - "+ material;
    }
    
}
