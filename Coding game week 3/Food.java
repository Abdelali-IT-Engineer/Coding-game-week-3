public  class Food extends Product {
    private String expirationDate ;
    
    public Food (String expirationDate ,String Name ,double price ,int quantity){
        super(Name, price , quantity);
        this.expirationDate= expirationDate;
        }

        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("ExpirationDate: " + expirationDate   );
            }
  
}
