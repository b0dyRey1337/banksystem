package BankSystem.Services;

import BankSystem.Entities.Account;
import BankSystem.Entities.Bill;

public class TransferService {
    public static void transfer(Account firstAccount, Account secondAccount, int transferAmount) {

        Bill firstPerson = firstAccount.getBill();
        Bill secondPerson = secondAccount.getBill();

        if (firstPerson.amount > transferAmount && transferAmount > 0) {
            secondPerson.amount += transferAmount;
            firstPerson.amount -= transferAmount;
            System.out.println("Перевод со счета " + firstAccount.getAccountHolder().getName() +
                    " на счет " + secondAccount.getAccountHolder().getName() +
                    " на сумму " + transferAmount + " совершен успешно");
        } else {
            System.out.println("На счете " + firstAccount.getAccountHolder().getName() +
                    " недостаточно средств для перевода на счет " + secondAccount.getAccountHolder().getName() +
                    ". Баланс счета: " + firstPerson.amount);
        }
    }
}
