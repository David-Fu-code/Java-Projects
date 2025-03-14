import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            // Read user's choice
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    // Initialize the name of Espresso
                    String espressoName = "Espresso";

                    // Initialize the price of Espresso per serving
                    double espressoPrice = 2.50;

                    // Ask the user for the type of roast and store it in espressoRoast
                    String espressoRoast = selectRoast();

                    // Ask the user for the number of shots and store it in numberOfShots
                    System.out.print("How many servings would you like? (a number please): ");
                    int numberOfShots = keyboard.nextInt();

                    Espresso myEspresso = new Espresso(espressoName, espressoRoast, espressoPrice, numberOfShots);

                    myEspresso.grindBeans();
                    myEspresso.brewCoffee();
                    myEspresso.printInfo();
                    myEspresso.printEspressoDetails();

                    break;
                case 2:

                    // Initialize the name of Latte
                    String latteName = "Latte";

                    // Initialize the price of Latte
                    double lattePrice = 3.50;

                    // Ask the user for the type of roast and store it in latteRoast
                    String latteRoast = selectRoast();

                    // Ask the user for the milk type and store it in milkType
                    String milkType = selectMilk();

                    // Ask the user if they want syrup or not
                    String syrupFlavor = selectSyrup();

                    Latte myLatte = new Latte(latteName, latteRoast,lattePrice, milkType, syrupFlavor );

                    myLatte.grindBeans();
                    myLatte.brewCoffee();
                    myLatte.printInfo();
                    myLatte.printLatteDetails();

                    break;
                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    public static String selectRoast(){
        List<String> validRoast = Arrays.asList("light", "medium", "dark");
        Scanner keyboard = new Scanner(System.in);

        while (true){
            System.out.print("What Roast would you like? (light, medium, dark): ");
            String latteRoast = keyboard.next().toLowerCase().trim();

            if (validRoast.contains(latteRoast)){
                return latteRoast;
            }else{
                System.out.println("Invalid option, chose between (light, medium, dark)");
            }
        }
    }

    public static String selectMilk(){
        List<String> validRoast = Arrays.asList("whole", "skim", "almond", "oat");
        Scanner keyboard = new Scanner(System.in);

        while (true){
            System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
            String milkType = keyboard.next().toLowerCase().trim();

            if (validRoast.contains(milkType)){
                return milkType;
            }else{
                System.out.println("Invalid option, chose between (whole, skim, almond, oat)");
            }
        }
    }

    public static String selectSyrup(){
        List<String> validSyrup = Arrays.asList("vanilla", "caramel", "hazelnut");
        Scanner keyboard = new Scanner(System.in);

        while (true){
            System.out.print("Would you like syrup? (yes/ no): ");
            String syrupWanted = keyboard.next().toLowerCase();

            String syrupFlavor = "no";
            // if syrupWanted is yes, Ask the user for the syrup flavor and store it in syrupFlavor
            if(syrupWanted.equals("yes")) {
                System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                syrupFlavor = keyboard.next().toLowerCase();

                if (validSyrup.contains(syrupFlavor)){
                    return syrupFlavor;
                }else{
                    System.out.println("Invalid option, chose between (vanilla, caramel, hazelnut)");
                }

            }else{
                return syrupFlavor;
            }

        }
    }
}
