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

        //dialing
        System.out.println("Who would you like to call?: ");
        input = scanner.nextLine();
        System.out.println("Calling " + input+"...");

    }

    public static void display(CellPhone firstPhone) {
        System.out.println("Serial Number: " + firstPhone.getSerialNumber());
        System.out.println("Model: " + firstPhone.getModel());
        System.out.println("Carrier: " + firstPhone.getCarrier());
        System.out.println("Phone number: " + firstPhone.getPhoneNumber());
        System.out.println("Owner name: " + firstPhone.getOwner());
    }

    public static void CellPhone() {
        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setPhoneNumber("Alex");
        cellPhone1.setOwner("Alex ");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setPhoneNumber("Bob");
        cellPhone2.setOwner("Bob");

        cellPhone1.dial(cellPhone1.getPhoneNumber());
    }
}

