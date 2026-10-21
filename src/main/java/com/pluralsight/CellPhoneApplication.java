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

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(1010101010);
        cellPhone2.setModel("iPhone X");
        cellPhone2.setCarrier("TMobile");
        cellPhone2.setNumber("840-443-9716");
        cellPhone2.setOwner("Sri");

        CellPhone cellPhone3 = new CellPhone(
                101010101,
                "iPhone 16",
                "Verizon",
                "6149746110",
                "Ben"
                );

        display(phone);
        display(cellPhone2);
        display(cellPhone3);

        System.out.println();
        phone.dial(cellPhone2.getNumber());
        cellPhone2.dial(phone.getNumber());
        phone.dial(cellPhone3.getNumber());
    }

        public static void display(CellPhone phone) {
            System.out.println("Serial number: " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("Phone Number: " + phone.getNumber());
            System.out.println("Owner: " + phone.getOwner());

    }
}
