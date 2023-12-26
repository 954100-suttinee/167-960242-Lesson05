package main.java.org.dii.oop.exercise01;
import java.util.Date;
import java.util.Vector;

public class CarParking {
    private final Vector<Receipt> receipts;

    public CarParking() {
        this.receipts = new Vector<>();
    }

    public Vector<Receipt> getReceipts() {
        return receipts;
    }

    public void deposit(Receipt receipt) {
        receipts.add(receipt);
    }

    public Receipt issuedReceipt(String plateNumber) {
        for (Receipt receipt : receipts) {
            if (receipt.getPlateNumber().equals(plateNumber)) {
                receipt.setReceiptDate(new Date());
                return receipt;
            }
        }
        return null;
    }

    public void remove(Receipt receipt) {
        receipts.remove(receipt);
    }
}
