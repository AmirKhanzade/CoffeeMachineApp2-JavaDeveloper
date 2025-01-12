public class CoffeeMaker {
    //To implement the separation of concerns, create a utility class named CoffeeMaker
    //This class will contain the common coffee-making logic that can be used to perform the coffee-making process for any type of coffee
    //Create a method called prepareCoffee that takes a Coffee object as an argument and executes the proper coffee-making process. 
    //This method must be of type void because it won’t return any value.
    public void prepareCoffee(Coffee coffeeObject){
        // Call the grindBeans() method on the Coffee object using the dot operator.
        coffeeObject.grindBeans();
        // Call the brewCoffee() method on the Coffee object using the dot operator.
        coffeeObject.brewCoffee();
        
    }
}
