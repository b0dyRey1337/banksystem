package BankSystem.Entities;

public class Account {

    // Fields
    private Person accountHolder;

    private Bill bill;

    // Constructor
    public Account(Person accountHolder, Bill bill) {
        this.accountHolder = accountHolder;
        this.bill = bill;
    }

    // Getters and Setters
    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
