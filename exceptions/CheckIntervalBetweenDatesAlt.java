package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Write a method receiving two strings representing dates (i.e., yyyy-mm-dd)
 * and returning true if the first date is before the second date (see java.time.LocalDate).
 * Eventual exceptions must be locally intercepted and false is returned in case of errors.
 * The method has the following prototype:
 *
 * public static boolean checkIntervalBetweenDatesAlt(String begin, String end);
 */
public class CheckIntervalBetweenDatesAlt  {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){
        try {
            LocalDate beginDate = LocalDate.parse(begin);
            LocalDate endDate = LocalDate.parse(end);
            return beginDate.isBefore(endDate);
        }
        catch (DateTimeParseException e){
            return false;
        }
    }
}
