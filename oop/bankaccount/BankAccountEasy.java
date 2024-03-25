package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {
    /**
     * BankAccountEasy represents a basic bank account, which does not support negative balances, international transfers,
     * and does not pay any interest. Nevertheless, deposits and withdrawals are free.
     */
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0, 0.0);
    }

    public double withdraw(double amount) {
        double allowedEasyAmount = Math.min(amount, balance);
        return withdraw(allowedEasyAmount);
    }

    public double transfer(BankAccount other, double amount) {
        String CountryCodeSrc = IBAN.substring(0, 2);
        String CountryCodeDst = other.getIBAN().substring(0, 2);
        if (!CountryCodeSrc.equals(CountryCodeSrc)) {
            throw new IllegalArgumentException("International transfers invalid");
        }
        double AllowedAmount = withdraw(amount);
        other.deposit(AllowedAmount);
        return AllowedAmount;
    }

}
