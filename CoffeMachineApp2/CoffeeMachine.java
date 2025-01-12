import java.util.Scanner;

public class CoffeeMachine {

    // contains the main() method, which provides a menu for users to choose their
    // desired beverage.
    // Based on the selected beverage (Espresso or Latte), the user provides more
    // information about their coffee order.
    // This method can be used to create the objects of your classes and call
    // respective methods to see if your code is working as expected.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Create the object of CoffeeMaker class
        CoffeeMaker defultcoffee=new CoffeeMaker();
        //create a defult esperso object
        Espersso defultEspersso=new Espersso("espersso", "dark", 2.5, 3);
        //create a defult latte object
        Latte defultLatte=new Latte("latte", "light",3.5, "oat milk", "");
        //Call the prepareCoffee() method on your CoffeeMaker object and pass the Espresso object as an argument.
        defultcoffee.prepareCoffee(defultEspersso);
        //Call the printInfo() method on your Espresso object using the dot operator.
        defultEspersso.printInfo();
        //  Call the prepareCoffee() method on your CoffeeMaker object and pass the Latte object as an argument.
        defultcoffee.prepareCoffee(defultLatte);
        defultLatte.printInfo();

        boolean run = true;
        double totalPrice = 0;
        while (run) {
            System.out.println("welcome to the coffee machine App");
            System.out.println("select 1 for espersso");
            System.out.println("select 2 for latte");
            System.out.println("select 3 for exit");
            System.out.println("please enter 1,2 or 3");

            int userinput = input.nextInt();

            switch (userinput) {
                case 1:
                    input.nextLine();
                    System.out.println("please enter the roast name (light,medium,dark) : ");
                    String roastName = input.nextLine();
                    System.out.println("please enter how many shots you want : ");
                    int shots = input.nextInt();
                    // Create an object of the Espresso class using the parameterized constructor.
                    // Use the already declared variables as arguments
                    Espersso myespersso = new Espersso("espersso", roastName, 2.5, shots);
                    // Call the grindBeans() method on your Espresso object using the dot operator.
                    myespersso.grindBeans();
                    // Call the brewCoffee() method on your Espresso object using the dot operator.
                    myespersso.brewCoffee();
                    // Call the printInfo() method on your Espresso object using the dot operator.
                    myespersso.printInfo();
                    // Call the printEspressoDetails() method on your Espresso object using the dot
                    // operator.
                    totalPrice += shots * 2.5;
                    System.out.println("your total price bill is : " + totalPrice);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("please enter the roast name (light,medium,dark) : ");
                    String roastName2 = input.nextLine();
                    System.out.println("select milk type : whole milk , almond milk , oat milk , low fat milk");
                    String milktype = input.nextLine();
                    System.out.println("please enter flavor of syrup");
                    String syrup = input.nextLine();
                    // Create an object of the Latte class using the parameterized
                    // constructor and pass the already declared variables as arguments (in the
                    // precise order).
                    Latte mylatte = new Latte("latte", roastName2, 3.5, milktype, syrup);
                    // Call the grindBeans() method on your Latte object using the dot operator.
                    mylatte.grindBeans();
                    // Call the brewCoffee() method on your Latte object using the dot operator.
                    mylatte.brewCoffee();
                    // Call the printInfo() method on your Latte object using the dot operator.
                    mylatte.printInfo();
                    totalPrice += 3.5;
                    System.out.println("your total price is :" + totalPrice);
                    break;

                case 3:
                    System.out.println("have a nice day! goodbye");
                    run = false;
                    break;
            }
        }

    }
}
