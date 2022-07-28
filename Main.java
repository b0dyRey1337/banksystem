package BankSystem;

import BankSystem.Entities.Account;
import BankSystem.Entities.Bill;
import BankSystem.Entities.Person;
import BankSystem.Services.DepositService;
import BankSystem.Services.PaymentService;
import BankSystem.Services.TransferService;

public class Main {
    public static void main(String[] args) {

        // Persons and they own bill and account
        Person John = new Person("John", "Fletcher", "89009990099");
        Bill JohnBill = new Bill(1500);
        Account JohnAcc = new Account(John, JohnBill);

        Person Mira = new Person("Mira", "Fletcher", "89090009900");
        Bill MiraBill = new Bill(500);
        Account MiraAcc = new Account(Mira, MiraBill);

        Person Michael = new Person("Michael", "Fletcher", "89990909009");
        Bill MichaelBill = new Bill(50);
        Account MichaelAcc = new Account(Michael, MichaelBill);

        TransferService.transfer(JohnAcc, MiraAcc, 1000);
        System.out.println(MiraBill.getAmount());

        DepositService.deposit(MichaelAcc, 150);
        System.out.println(MichaelBill.getAmount());

        PaymentService.payment(MiraAcc, 450);
        System.out.println(MiraBill.getAmount());

    }
}
