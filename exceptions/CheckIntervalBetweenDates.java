package exceptions;

import java.time.LocalDate;

/**
 * Write a method receiving two strings representing dates (i.e., yyyy-mm-dd)
 * and returning true if the first date is before the second date (see java.time.LocalDate).
 * Eventual exceptions must be delegated to the caller (Remember: not all exceptions are checked).
 * The method has the following prototype:
 * <p>
 * public static boolean checkIntervalBetweenDates(String begin, String end);
 */
public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) {

        LocalDate beginDate = LocalDate.parse(begin);
        LocalDate endDate = LocalDate.parse(end);
        return beginDate.isBefore(endDate);
    }
}
