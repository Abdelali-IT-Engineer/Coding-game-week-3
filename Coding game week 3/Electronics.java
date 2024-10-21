public class Electronics extends Product {
    private String brand;
    private int warranty ;
    
    public Electronics (String brand, int warranty, String Name, double price, int quantity){
        super(Name, price, quantity);
        this.brand  = brand  ;
        this.warranty = warranty;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand: " + brand + ", Warranty: " + warranty + "ans");
    }
}
