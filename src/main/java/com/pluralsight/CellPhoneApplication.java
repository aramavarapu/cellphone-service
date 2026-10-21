package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(scanner.nextLine().trim());
        phone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine().trim());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine().trim());

        System.out.print("What is the phone number? ");
        phone.setNumber(scanner.nextLine().trim());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine().trim());

        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getNumber());
        System.out.println("Owner: " + phone.getOwner());

    }
}
