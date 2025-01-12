public class Coffee {

    //some basic methods for common coffee attributes. 
    // Attributes to store information about the coffee
    String name; //a String representing, for example, “Espresso.”
    String roast; //a String representing how strong the coffee must be, for example, “medium.”
    int CafeinLevelInMg; //an int storing the caffeine level in milligrams, but its value is calculated based on the roast.
    double price; //a double representing the price of the coffee in dollars (for example, 3.45).

    //There is a parameterized constructor with three arguments. It assigns these values to the corresponding attributes
    public Coffee(String name,String roast,double price){
        this.name=name;
        this.roast=roast;
        this.price=price;
        //and then calls the setCaffeineLevel() method. This ensures the caffeine level is set based on the chosen roast.
        setCaffeineLevel();
    }
    //The method setCaffeineLevel()
    // checks the roast attribute value using an if-else if statement and assigns the appropriate value to the caffeineLevel attribute.
    public void setCaffeineLevel(){
        if(roast.equals("light")){
            CafeinLevelInMg=50;
        }
        else if(roast.equals("medium")){
            CafeinLevelInMg=100;
        }
        else if(roast.equals("dark")){
            CafeinLevelInMg=150;
        }
        else{
            CafeinLevelInMg=0;
        }
    }
    //The grindBeans() and brewCoffee() methods simulate the coffee preparation,
    // and the printInfo() method is defined to print the name, roast, and caffeineLevel of the coffee in a formatted way.
    public void grindBeans(){
        System.out.println("\ngrinding beans for "+name+"....");
    }
    public void brewCoffee(){
        System.out.println("\nbrewing coffee for "+name+"....");
    }
    // Method to print the information about the coffee
    public void printInfo(){
        System.out.println("\nyou orderd "+name+" with the roast "+roast);
        System.out.println("\nyour cafein level in your coffee is "+CafeinLevelInMg);
    }
    
}