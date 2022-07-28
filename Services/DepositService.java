package BankSystem.Services;

import BankSystem.Entities.Account;
import BankSystem.Entities.Bill;

public class DepositService {
    public static void deposit(Account account, int depositAmount) {
        Bill accountBill = account.getBill();

        accountBill.amount += depositAmount;

        System.out.println("Счет " + account.getAccountHolder().getName() + " успешно пополнен на " + depositAmount);
    }
}
