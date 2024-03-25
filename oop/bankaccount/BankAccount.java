package oop.bankaccount;

public interface BankAccount {

    /**
     * a valid IBAN must have a length comprised between 8 and 34 characters
     * and the first two characters (representing the country) must be uppercase letters
     *
     * @param IBAN
     */
    static void checkIBAN(String IBAN) {
        if (IBAN.length() < 8 || IBAN.length() > 34) {
            throw new IllegalArgumentException("Invalid length");
        }
        String CountryCode = IBAN.substring(0, 2);
        if (!(Character.isLetter(CountryCode.charAt(0))) && (Character.isLetter(CountryCode.charAt(1)))) {
            throw new IllegalArgumentException("Invalid country code");
        }
        if (!(Character.isUpperCase(CountryCode.charAt(0)) && Character.isUpperCase(CountryCode.charAt(1)))) {
            throw new IllegalArgumentException("Invalid country code");
        }
    }

    String getIBAN();

    void setIBAN(String IBAN);

    double getBalance();

    void setBalance(double balance);

    double getOperationFee();

    void setOperationFee(double operationFee);

    double getInterestRate();

    void setInterestRate(double interestRate);

    void deposit(double amount);

    double withdraw(double amount);

    double transfer(BankAccount other, double amount);

    void addInterest();

    void applyFee();


}
