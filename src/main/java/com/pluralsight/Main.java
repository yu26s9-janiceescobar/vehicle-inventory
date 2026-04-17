package com.pluralsight;
import com.pluralsight.ui.Console;
import com.pluralsight.models.Vehicle;

public class Main {


    private static String displayMenu(){
        return """
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                >\s""";
    }


    private static Vehicle[] loadInventory(){
        Vehicle[] vehicle = new Vehicle[20];
        vehicle[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicle[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicle[2] = new Vehicle(101123, "Chevrolet Malibu","Black", 50000, 9700);
        vehicle[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicle[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicle[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        return vehicle;
    }


    private static void displayVehicles(Vehicle[] vehicle) {
        for (Vehicle v : vehicle) {
            System.out.println(v);
        }
    }


    private static void listAllVehicles(Vehicle[] vehicle){
        displayVehicles(vehicle);
    }

    private static int getVehicleCount(Vehicle[] vehicle){
        int count = 0;
        for (Vehicle v : vehicle) {
            if (v != null) {
                count++;
            }
        return count;
    }


    public static void main(String[] args){
        int option;
        Vehicle[] vehicleInventory = loadInventory();

        do {
            option = Console.promptForInt(displayMenu());
            switch(option){
                case 1:
                    listAllVehicles(vehicleInventory);
                    break;
                case 2:
                    // Search by make/model
                case 3:
                    // Search by price range
                case 4:
                    // Search by color
                    break;
                case 5:
                    // add a vehicle
                    break;
                case 6:
                    break;
            }
        }
        while (option != 6);{
            System.out.print("You have exited the main menu. ");
        }
    }

}
