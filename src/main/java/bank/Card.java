package bank;

import util.Generators;

public class Card {
    private long cardNumber;
    private BankAccount bankAccount;

    public Card(BankAccount bankAccount) {
        this.cardNumber = Generators.getGeneratedLong();
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
