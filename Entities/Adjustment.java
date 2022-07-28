package BankSystem.Entities;

public class Adjustment {

    // Fields
    private Bill bill;

    // Constructor
    public Adjustment(Bill bill) {
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
