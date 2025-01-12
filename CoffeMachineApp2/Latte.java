public class Latte extends Coffee {
    // will inherit from the Coffee class. These subclasses define specific functionalities and details unique to each beverage type.
    // Add two String attributes to this class:
    //milkType to store the type of milk used in the latte. For example, “Whole milk”, “Skimmed milk”, “Oat milk”, or “Almond milk”.
    String milkType;
    String syrupFlavor; //syrupFlavor to represent the syrup flavor to be added to the latte.
    // For example, “Vanilla”, “Caramel”, “Hazelnut”, or “None” if no syrup is used.
    // Create a parameterized constructor with five arguments, name, roast, price, milkType, and syrupFlavor.
    public Latte(String name,String roast,double price,String milkType,String syrupFlavor){
        //Use super to call the constructor of the Coffee class and set the name, roast, and price.
        super(name,roast,price);
        // Initialize milkType and syrupFlavor using this.
        this.milkType=milkType;
        this.syrupFlavor=syrupFlavor;
    }
    
    //override the grindBeans() method to simulate the coarse grinding of beans for a latte
    @Override
    public void grindBeans(){
        System.out.println("Grinding coffee beans coarsely for a latte (medium grind)");
    }
    //Override the brewCoffee() method to:
    @Override
    public void brewCoffee(){
        System.out.println("brewing coffee for latte..");
        if(syrupFlavor==""){
            System.out.println("no syrup has been selected");
        }
        else{
            System.out.println("add syrup flavor");
        }
        System.out.println("steam milk");
        System.out.println("combine coffee with steamed milk, and add a layer of foam.");

    }
    //Override the printInfo() method to print the common and specific details of the latte, including the bill
    @Override
    public void printInfo(){
        System.out.println("your latte has the kind of milk of "+milkType);
        System.out.println("your latte has the syrup with flavor of "+syrupFlavor);
        System.out.println("each latte has the cost of 3.5$");
        System.out.println("your latte roast is"+roast);
        System.out.println("price of your latte is"+price);
    }
}
