package com.pluralsight;
import com.pluralsight.ui.Console;
import com.pluralsight.models.Vehicle;

public class Main {
    private static Vehicle[] vehicle = new Vehicle[20];

    private static String displayMenu() {
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


    private static int getVehicleCount(Vehicle[] list) {
        int count = 0;
        for (Vehicle v : list) {
            if (v != null) {
                count++;
            }
        }
        return count;
    }


    private static Vehicle[] loadInventory() {
        vehicle[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicle[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicle[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 97000);
        vehicle[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 75000);
        vehicle[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicle[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        return vehicle;
    }


    private static void displayVehicles(Vehicle[] list) {
        int length = getVehicleCount(list);
        for (int i = 0; i < length; i++){
            System.out.println(list[i]);
        }
    }


    private static void listAllVehicles() {
        System.out.printf("%43s%n"," Full Vehicle Inventory");
        displayVehicles(vehicle);
    }

    private static Vehicle[] addVehicle(){
        int index = getVehicleCount(vehicle);
        int vehicleId = Console.getVehicleId();
        String makeModel = Console.getModel();
        String color = Console.getColor();
        int odometerReading = Console.getOdometer();
        double price = Console.getPrice();
        vehicle[index] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        return vehicle;

    }
    private static Vehicle[] searchByModel(){
        Vehicle[] filteredByModel = new Vehicle[20];
        int vehiclesFound = 0;
        String makeModel = Console.getModel();

        int length = getVehicleCount(vehicle);
        for (int i = 0; i < length; i++){
            if ((vehicle[i].getMakeModel()).equalsIgnoreCase(makeModel)){
                filteredByModel[vehiclesFound] = vehicle[i];
                vehiclesFound++;
            }
        }
        return filteredByModel;
    }
    private static Vehicle[] searchByPrice() {
        Vehicle[] filterByPrice = new Vehicle[20];

        String priceRange = Console.promptForString("Enter price range (min-max): ");
        int index = priceRange.indexOf("-");
        int min = Integer.parseInt(priceRange.substring(0, index));
        int max = Integer.parseInt(priceRange.substring(index + 1));

        int length = getVehicleCount(vehicle);
        int counter = 0;
        for (int i = 0; i < length; i++){
            if ((min < vehicle[i].getPrice() && vehicle[i].getPrice() < max)){
                filterByPrice[counter] = vehicle[i];
                counter++;
            }
        }
        return filterByPrice;

    }

    public static Vehicle[] searchByColor(){
        Vehicle[] filterByColor = new Vehicle[20];
        String color = Console.getColor();
        int length = getVehicleCount(vehicle);
        int counter = 0;
        for (int i = 0; i < length; i++){
            if (vehicle[i].getColor().equalsIgnoreCase(color)){
                filterByColor[counter] = vehicle[i];
                counter++;
            }
        }
        return filterByColor;
    }

    public static void main (String[] args){
        int option;
        vehicle = loadInventory();
        do {
            option = Console.promptForInt(displayMenu());
            switch (option) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    Vehicle[] filterByModel = searchByModel();
                    displayVehicles(filterByModel);
                    break;
                case 3:
                    Vehicle[] filterByPrice = searchByPrice();
                    displayVehicles(filterByPrice);
                    break;
                case 4:
                    Vehicle[] filterByColor = searchByColor();
                    displayVehicles(filterByColor);
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

