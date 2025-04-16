package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        CellPhone phone = new CellPhone();

        Scanner scanner = new Scanner(System.in);


        //serial number
        System.out.print("Enter serial number: ");
        String input = scanner.nextLine();
        int serialNumber = Integer.parseInt(input);

        phone.setSerialNumber(serialNumber);


        //model
        System.out.print("Enter model: ");
        input = scanner.nextLine();

        phone.setModel(input);


        //carrier
        System.out.print("Enter carrier: ");
        input = scanner.nextLine();

        phone.setCarrier(input);


        //phone number
        System.out.print("Enter phone number: ");
        input = scanner.nextLine();

        phone.setPhoneNumber(input);


        //owner
        System.out.println("Enter owner name: ");
        input = scanner.nextLine();

        phone.setOwner(input);


        //print to console
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner name: " + phone.getOwner());

    }
}