# CoffeeMachineApp2-JavaDeveloper
Step 1: Override methods in the Latte subclass for specific behaviors
A latte is a coffee drink for which the coffee beans are coarsely ground (medium grind, as they call it) and then brewed with hot water under no pressure. It is prepared with steamed milk, a layer of milk foam, and optionally flavored with syrup (for example, vanilla or caramel). 

You must represent this specialized grinding and brewing behavior in your Latte class.

 🖥️ TODO 11:Open the Latte class and override the grindBeans() method to simulate the coarse grinding of beans for a latte. For example, the method may print “Grinding coffee beans coarsely for a latte (medium grind)”.

 🖥️ TODO 12: Override the brewCoffee() method to:

Simulate brewing coffee for a latte. 

Check if syrupFlavor is selected.

If yes, add syrup flavor,

steam milk, 

combine coffee with steamed milk, and 

add a layer of foam.
 🖥️ TODO 13: Override the printInfo() method to print the common and specific details of the latte, including the bill:

 🖥️ TODO 14: The printInfo() method in the Coffee class already prints the common coffee details in a formatted way, so call it using super.

 🖥️ TODO 15: Cut the print statements from the printLatteDetails() method and paste them here.

 🖥️ TODO 16: Delete the printLatteDetails() method because it is not needed anymore.

Step 2: Grind and brew a latte
To verify that your Latte class works as expected, complete the following TODOs in the main() method inside the CoffeeMachine class.

 🖥️ TODO 17: Create a Latte object using the parameterized constructor and pass the already declared variables as arguments (in the precise order).

For example, Latte myFavoriteLatte = new Latte(LatteName, LatteRoast, LattePrice, milkType, syrupFlavor);

 🖥️ TODO 18: Call the grindBeans() method on the Latte object using the dot operator.

 🖥️ TODO 19: Call the brewCoffee() method on the Latte object using the dot operator.

 🖥️ TODO 20: Call the printInfo() method on the Latte object using the dot operator.
 Method overriding allowed you to create distinct behaviors for different coffee types, showcasing the power of polymorphism. The CoffeeMaker class demonstrated handling various coffee objects through a single Coffee reference, promoting code reusability.

Through this lab, you've better understood how object-oriented programming can be applied to create complex yet maintainable systems.
