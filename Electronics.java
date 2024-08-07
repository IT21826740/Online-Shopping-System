package Q3;

public class Electronics extends Product{
   private int warrantyPeriod;

   public Electronics(int productID, String name, double price,int warrantyPeriod) {
        super(productID, name, price); 
        this.warrantyPeriod=warrantyPeriod;   
    }
    

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getProductDetails() {
        return super.getProductDetails()+"  warrantyPeriod -" +warrantyPeriod;
    }
    
}
