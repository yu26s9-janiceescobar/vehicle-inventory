package com.pluralsight.ui;
import java.util.*;
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


}
