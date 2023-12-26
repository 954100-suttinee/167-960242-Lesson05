package main.java.org.dii.oop.exercise01;

import java.util.Scanner;

public class CarParkingSystem {
    CarParking carParking = new CarParking();

    public void run() {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("1. deposit");
            System.out.println("2. issued receipt");
            System.out.println("3. display all receipt");
            System.out.println("4. exit");
            System.out.print("Enter the method [1-4]: ");
            String method = in.nextLine();

            if ("1".trim().equals(method)) {
                System.out.print("\nEnter the plate number: ");
                String plateNumber = in.nextLine();
                System.out.print("Enter the customer name: ");
                String customerName = in.nextLine();
                Receipt receipt = new Receipt(plateNumber, customerName);
                carParking.deposit(receipt);

                System.out.println();

            } else if ("2".trim().equals(method)) {
                if (carParking.getReceipts().size() > 0) {
                    System.out.print("\nEnter the plate number: ");
                    String plateNumber = in.nextLine();
                    Receipt receipt = carParking.issuedReceipt(plateNumber);

                    if (receipt != null) {
                        System.out.print("Enter the number of hours: ");
                        String strHours = in.nextLine();
                        int hours = Integer.parseInt(strHours);
                        receipt.setHours(hours);

                        System.out.println();
                        System.out.println("Receipt deposit date: " + /*add something*/);
                        System.out.println("Receipt receipt date: " + /*add something*/);
                        System.out.println("Receipt number: " + /*add something*/);
                        System.out.println("Payment total: " + /*add something*/);
                        System.out.println();
                    } else {
                        System.out.printf("\nThe plate number [%s] was not found.\n\n", plateNumber);
                    }

                    carParking.remove(receipt);
                } else {
                    System.out.println("\n\tEmpty data ...\n");
                }

            } else if ("3".trim().equals(method)) {
                System.out.println("\nList receipt:");
                if (carParking.getReceipts().size() > 0) {
                    for (Receipt receipt : carParking.getReceipts()) {
                        System.out.println("\tReceipt number: " /*add something*/
                                + ", Plate number: "  /*add something*/
                                + ", Customer name: "  /*add something*/);
                    }
                    System.out.println();
                } else {
                    System.out.println("\tNo receipt...\n");
                }

            } else if ("4".trim().equals(method)) {
                break;
            } else {
                System.out.println("\n\tInvalid method number, try again !!\n");
            }
        } while (true);
    }
}
