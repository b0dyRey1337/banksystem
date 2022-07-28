package BankSystem.Entities;

import BankSystem.Entities.Bill;

public class Payment {

    // Fields
    private Bill bill;

    // Constructor
    public Payment(Bill bill) {
        this.bill = bill;
    }

    // Getters and Setters
    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
