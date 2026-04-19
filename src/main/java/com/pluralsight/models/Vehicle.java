package com.pluralsight.models;

public class Vehicle {
    private int vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    /**
     * Creates a vehicle with vehicle information.
     * @param vehicleId the id of vehicle.
     * @param makeModel the make/model of vehicle.
     * @param color the color of vehicle.
     * @param odometerReading the odometer reading of vehicle.
     * @param price the price of the vehicle.
     */
    public Vehicle(int vehicleId, String makeModel, String color, int odometerReading, double price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    public int getVehicleId(){
        return this.vehicleId;
    }
    public void setVehicleId(int vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getMakeModel(){
        return this.makeModel;
    }
    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setOdometerReading(int odometerReading){
        this.odometerReading = odometerReading;
    }
    public int getOdometerReading(){
        return this.odometerReading;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    /**
     * Organized format of vehicle details
     * @return String of vehicle details in organized format.
     */
    @Override
    public String toString(){
        return String.format("%7d %-10s %-19s %-14s %-15d $%,.2f %n",
                vehicleId," ", makeModel, color, odometerReading, price);
    }

}
