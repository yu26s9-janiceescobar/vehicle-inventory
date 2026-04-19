package com.pluralsight;
import com.pluralsight.ui.Console;
import com.pluralsight.models.Vehicle;
import com.pluralsight.models.Inventory;
public class Main {
    private static Inventory inventory = new Inventory();
    private static Vehicle[] vehicle = inventory.getVehicle();

    /**
     * Only vehicles of the model user enter is displayed.
     */
    private static void searchByModel(){
        String model = Console.getModel();
        Console.displayMakeModel(vehicle, model);
    }

    /**
     * Adds vehicle information user enters to inventory.
     */
    private static void addVehicle(){
        int index = Inventory.getVehicleCount(vehicle);
        int vehicleId = Console.getVehicleId();
        String makeModel = Console.getModel();
        String color = Console.getColor();
        int odometerReading = Console.getOdometer();
        double price = Console.getPrice();
        vehicle[index] = new Vehicle(vehicleId, makeModel, color, odometerReading, price); 
    }

    /**
     * Displays full inventory of vehicles.
     */
    private static void listAllVehicles(){
        Console.displayAllVehicles(vehicle);
    }

    /**
     * Only vehicles between the price range user enters is displayed.
     */
    private static void searchByPrice() {

        String priceRange;
        int index;
        do {
           priceRange = Console.promptForString("Enter price range (min-max): ");
           index = priceRange.indexOf("-"); // finds index of dash included in user response
           if (index == -1){ // index is -1 if the dash in user input is not found.
               System.out.println("Please separate minimum and maximum price range using a dash (min-max)");
           }
        }
        while(index == -1); // Will repeat until user enters the correct format.

        double min = Integer.parseInt(priceRange.substring(0, index)); // Stores first number in string input
        double max = Integer.parseInt(priceRange.substring(index + 1)); // Stores second number in string input
        Console.displayByPrice(vehicle, min, max);

    }

    /**
     * Only vehicles with the color that the user enters is displayed.
     */
    private static void searchByColor(){
        String color = Console.getColor();
        Console.displayByColor(vehicle, color);
    }

    /**
     * Displays menu and menu options allowing user to choose an option including
     * list all vehicles, search by make/model,search by price range,
     * search by color, add a vehicle to inventory, or quit program.
     */
    public static void main (String[] args){
        int option;
        do {
            Console.displayMenu();
            option = Console.promptForInt("Enter an option: ");
            switch (option) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByModel();
                    break;
                case 3:
                    searchByPrice();
                    break;
                case 4:
                    searchByColor();
                    break;
                case 5:
                    addVehicle();
                    break;
                case 6:
                    break;
            }
        }
        while (option != 6);
            System.out.print("You have exited the main menu. ");

    }
}

