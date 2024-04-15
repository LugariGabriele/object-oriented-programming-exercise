package collections;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortAccount {

    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }
    }

    /**
     *  lambda(->) separates the parameters (left-side) from the implementation (right side).
     * for sort the element in specified parameter you need to implement a Compare of that parameter in the element
     * the Double class wraps a value of the primitive type double in an objecte turn
     */
    public static void sortByAmount(List<Account> accounts){

        accounts.sort((a1,a2)->Double.compare(a1.getAmount(),a2.getAmount()));
    }
    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort((a1,a2)->Double.compare(a1.getInterestRate(),a2.getInterestRate()));

    }
    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort((a1,a2)->a1.getDuePayment().compareTo(a2.getDuePayment()));

    }
}
