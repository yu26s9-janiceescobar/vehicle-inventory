package com.pluralsight.models;
public class Inventory {
    private Vehicle[] vehicle;

    /**
     * Creates an inventory with preloaded vehicles.
     */
    public Inventory(){
        this.vehicle = new Vehicle[20];
        this.vehicle[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        this.vehicle[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        this.vehicle[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 97000);
        this.vehicle[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 75000);
        this.vehicle[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        this.vehicle[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
    }
    public Vehicle[] getVehicle(){
        return this.vehicle;
    }

    /**
     * Counts how many vehicles are currently in the inventory.
     * @param vehicle the list of vehicles.
     * @return int the number of vehicles currently in the inventory.
     */
    public static int getVehicleCount(Vehicle[] vehicle) {
        int count = 0;
        for (Vehicle v : vehicle) {
            if (v != null) {
                count++;
            }
        }
        return count;
    }

}
