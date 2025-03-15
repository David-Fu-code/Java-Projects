// Inherit from Coffee using the extends keyword
public class Espresso extends Coffee {

    // Declare an attribute to store the number of shots (int)
    int numberOfShots;

    // Constructor to initialize all attributes
    public Espresso(String name, String roast, double price, int numberOfShots) {
        // Use super to call the Coffee constructor
        super(name, roast, price);

        // Initialize numberOfShots using this
        this.numberOfShots = numberOfShots;
    }
    // Implement the grindBeans method
    @Override
    public void grindBeans() {
        System.out.println("\nGriding the espresso beans finely...");
    }
    // Implement the brewCoffee method
    @Override
    public void brewCoffee() {
        System.out.println("Brewing the espresso under high pressure...");
    }
    // Implement the printInfo method
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " + price + "$. Your total bill is " + (price * numberOfShots) + "$.");

    }

}
