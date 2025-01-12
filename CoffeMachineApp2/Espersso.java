public class Espersso extends Coffee{
    // will inherit from the Coffee class. These subclasses define specific functionalities and details unique to each beverage type.
    // Add an int attribute named numberOfShots to store the number of servings for this espresso.
    int numberOfShots;
    // Create a parameterized constructor with four arguments, name, roast, price, and numberOfShots.
    public Espersso(String name,String roast,double price,int numberOfShots){
        //Use super to call the constructor of the Coffee class and set the name, roast, and price.
        super(name,roast,price);
        // Initialize numberOfShots using this.
        this.numberOfShots=numberOfShots;
    }
   
    //Override the grindBeans() method to simulate grinding the espresso beans finely. 
    @Override
    public void grindBeans(){
        System.out.println("Grinding the espresso beans finely…");
    }
    // Override the brewCoffee() method to simulate brewing under high pressure.
    @Override
    public void brewCoffee(){
        System.out.println("Brewing the espresso under high pressure…");
    }
    //Override the printInfo() method to print the common and specific details of espresso including the bill.
    //The printInfo() method in the Coffee class already prints the common coffee details in a formatted way, so call it using super
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("you have orderd "+numberOfShots+" espersso");
        System.out.println("each shots espersso costs 2.5 $ ");
        System.out.println("your bill is : "+(numberOfShots*price)+" $ ");
        
    }
    


}
