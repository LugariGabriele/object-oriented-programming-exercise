package oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {

    protected double balance;
    protected double operationFee;
    protected double interestRate;
    String IBAN;

    public AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.operationFee = operationFee;
        this.interestRate = interestRate;
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    /**
     * Both accounts must refuse to set invalid IBANs or positive fees (money being added for each operation)
     *
     * @param operationFee
     */
    @Override
    public void setOperationFee(double operationFee) {
        if (operationFee < 0.0) {
            throw new IllegalArgumentException("Invalid negative fee");
        }
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }

    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void applyFee() {
        balance -= operationFee;
    }
}
