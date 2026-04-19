package com.pluralsight.ui;
import java.util.*;
import com.pluralsight.models.Vehicle;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);
    /**
     * Prompts the user for a double.
     * @param prompt to display to user.
     * @return the double user entered.
     */
    public static double promptForDouble(String prompt){
        System.out.print(prompt);
        return Double.parseDouble(scanner.nextLine()); // avoids leftover newline bug from nextDouble()
    }

    /**
     * Prompts the user for a string.
     * @param prompt to display to user.
     * @return the string user entered.
     */
    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Prompts the user for an integer.
     * @param prompt to display to user.
     * @return the integer user entered.
     */
    public static int promptForInt(String prompt){
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine()); // avoids leftover newline bug from nextInt()
    }
    public static int getVehicleId(){
       return promptForInt("Enter Vehicle Id: ");
    }
    public static String getModel(){
        return promptForString("Enter make/model: ");
    }
    public static String getColor(){
        return promptForString("Enter color: ");
    }
    public static int getOdometer(){
        return promptForInt("Enter odometer reading: ");
    }
    public static double getPrice(){
        return promptForDouble("Enter price: ");
    }

    public static void header(){
        System.out.printf("%-18s %-19s %-10s %-22s %s %n", "Vehicle Id", "Make/Model", "Color","Odometer Reading", "Price");
    }
    public static void noMatchesFoundMessage(){
        System.out.println("Oops! No matches found! Try again.");
    }
    public static void displayAllVehicles(Vehicle[] vehicle) {
        for (Vehicle v: vehicle){
            if (v != null) {
                header();
                System.out.println(v);
            }
        }
    }
    public static void displayByPrice(Vehicle[] vehicle, double min, double max){
        int count = 0;
        for (Vehicle v: vehicle){
            if (v != null){
                if (min < v.getPrice() && v.getPrice() < max ){
                    header();
                    System.out.println(v);
                    count++;
                }
            }
        }
        if (count==0){
            noMatchesFoundMessage();
        }
    }
    public static void displayByColor(Vehicle[] vehicle, String color){
        int count = 0;
        for (Vehicle v: vehicle){
            if (v != null){
                if (v.getColor().equalsIgnoreCase(color)){
                    header();
                    System.out.println(v);
                    count++;
                }
            }
        }
        if (count == 0){
            noMatchesFoundMessage();
        }
    }
    public static void displayMakeModel(Vehicle[] vehicle, String makeModel){
        int count = 0;
        for (Vehicle v: vehicle){
            if (v != null) {
                if (v.getMakeModel().equalsIgnoreCase(makeModel)){
                    header();
                    System.out.println(v);
                    count++;
                }
            }
        }
        if (count == 0){
            noMatchesFoundMessage();
        }
    }
    public static void displayMenu(){
       System.out.println("""
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit""");
    }

}
