package oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
/**
 * BankAccountPro represents a fully fledged bank account, allowing international transfers, negative balances,
 * and a 2pc interest rate. However, all this comes with the cost of 1 Euro for each operation (deposit, withdrawal).
 */
public BankAccountPro(String IBAN, double balance){
    super(IBAN,balance,1,0.02);
}
 public void deposit(double amount){
applyFee();
balance+=amount;
 }
 public double withdraw(double amount){
applyFee();
return withdraw(amount);
 }


}
