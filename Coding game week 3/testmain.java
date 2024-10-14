public class testmain {
    public static void main(String[] args) {
        
        Product A = new Product("jelaba", 200 , 50);
        Electronics B = new Electronics("hp", 2, "pc", 5000, 10);
        Food c = new Food("14/10/24", "toun", 20, 5000);
        c.displayInfo();
        A.displayInfo();
        B.displayInfo();
        A.updateQuantity(100);
        B.updateQuantity(40, false);
        A.displayInfo();
        B.displayInfo();
        
    }
    
}
