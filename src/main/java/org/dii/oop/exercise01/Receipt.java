package main.java.org.dii.oop.exercise01;

import java.util.Date;

public class Receipt {
    /*add modifier*/ double costPerHour = 20.0;
    /*add modifier*/ int latestReceiptNumber = 0;
    /*add modifier*/ String receiptNumber;
    /*add modifier*/ String plateNumber;
    /*add modifier*/ String customerName;
    /*add modifier*/ Date depositDate;
    /*add modifier*/ Date receiptDate;
    /*add modifier*/ int hours;


    private static String generateReceiptNumber() {
        latestReceiptNumber++;
        return String.format("R-%04d", 1000 + latestReceiptNumber);
    }
    public Receipt(String plateNumber, String customerName) {
        this.receiptNumber = generateReceiptNumber();
        this.depositDate = new Date();
        // initial plate number and customer name

    }
    public double getPaymentTotal() {
        return hours * costPerHour;
    }

}
