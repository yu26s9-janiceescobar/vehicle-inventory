package com.pluralsight.models;

public class Vehicle {
    private int vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

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

    @Override
    public String toString(){
        return String.format("%d %s %s %d $%.2f",
                vehicleId, makeModel, color, odometerReading, price);
    }

}
