package BankSystem.Services;

import BankSystem.Entities.Account;
import BankSystem.Entities.Bill;

public class PaymentService {
    public static void payment(Account account, int paymentAmount) {
        Bill accountBill = account.getBill();

        accountBill.amount -= paymentAmount;

        System.out.println("Платеж на сумму " + paymentAmount + " успешно произведен");
    }
}
