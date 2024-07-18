package exceptions;

/**
 * Write a method to check if a string representing a car licence plate respects the italian format
 * (i.e., LLDDDLL where L represents a letter while D a digit).
 * If the string does not respect the format, the method throws IllegalArgumentException (see Character.isDigit() and Character.isLetter() methods).
 * <p>
 * public static void checkLicencePlate(String licence);
 */
public class CheckLicencePlate {
    public static void checkLicencePlate(String licence) {
        if (licence.length() != 7) {
            throw new IllegalArgumentException("license size is wrong");
        }
        checkIfMadeOfLatter(licence.substring(0, 2));
        checkIfMadeOfDigit(licence.substring(2, 5));
        checkIfMadeOfLatter(licence.substring(5, 7));

    }

    public static void checkIfMadeOfLatter(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("not a letter " + c);
            }
        }
    }

    public static void checkIfMadeOfDigit(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("not a digit" + c);
            }
        }
    }
}
