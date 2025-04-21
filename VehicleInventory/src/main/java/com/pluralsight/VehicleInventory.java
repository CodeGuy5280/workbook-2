package com.pluralsight;
import java.util.Scanner;

public class VehicleInventory {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }
    public static class Vehicle {
        long vehicleID = 0;
        String makeModel = "";
        String color = "";
        int odometerReading = 0;
        float price = 0;

        Vehicle vehicle = new Vehicle();

        public long getVehicleID() {
            return vehicleID;
        }

        public String getMakeModel(){
            return makeModel;
        };

        public String getColor(){
            return color;
        }

        public int getOdometerReading(){
            return odometerReading;
        }

        public float getPrice(){
            return price;
        }

    }
}
