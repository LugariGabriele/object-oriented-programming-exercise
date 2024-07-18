package functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given the following class Account:
 * <p>
 * public static class Account {
 * double amount;
 * double interestRate;
 * LocalDateTime duePayment;
 * //...
 * }
 * Write a method for:
 * <p>
 * (a) filtering all the accounts whose duePayment is expired,
 * (b) apply interests (amount += amount * interestRate),
 * (c) sort them based their on amount (in decremental order),
 * (d) return a List of the filtered accounts.
 * The method has the following prototype:
 * <p>
 * public static List<Account> applyInterest(List<Account> accounts);
 */
public class BankAccount {
    public static List<Account> applyInterest(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getDuePayment().isBefore(LocalDateTime.now()))
                .peek(Account::Applyinterst)
                .sorted((o1, o2) -> (int) (o2.getAmount() - o1.getAmount()))
                .collect(Collectors.toList());
    }

    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDateTime duePayment) {
            this.duePayment = duePayment;
        }

        public void Applyinterst() {
            amount += amount * interestRate;
        }
    }
}
