public class Product {
    private String Name ;
    private double price;
    private int quantity;

    public Product(String Name ,double price ,int quantity){
        this.Name = Name ;
        this.price = price ;
        this.quantity = quantity ;
    
    }
    
    public String getName (){
        return Name;
    }
    public double getPrice (){
        return price ;
    }
    public int getQuantity (){
        return quantity ;
    }

    public void displayInfo(){
        System.out.println("Name: " + Name + ", Price: " + price + ", quantity :" + quantity  );
    }
    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
        System.out.println("The new quantity of " + Name + " is: " + quantity);
    }
    public static void welcomeMessage(){
        System.out.println("welcom to the inventory systeme");
    }
    public void updateQuantity(int addedQuantity, boolean addToExisting){
        if(addToExisting){
            this.quantity += addedQuantity;

        }
        else {
            this.quantity = addedQuantity ;
        }
    }
    
}