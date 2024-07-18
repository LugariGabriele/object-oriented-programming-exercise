package exceptions;

import java.text.ParseException;

/**
 * Write a method to check if a string is an alternating sequence of letters and numbers (for example, a0b3h4z1r4).
 * The method delegates ParseException for notifying the caller about eventual malformations
 * (see Character.isDigit() and Character.isLetter() methods). The method has the following prototype:
 * <p>
 * public static void checkString(String s) throws ParseException;
 */
public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2) {
            throw new ParseException(s, 0);
        }
        boolean wantingLetter = true;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) && (!wantingLetter)) {
                throw new ParseException(s, c);
            }
            if (Character.isDigit(c) && wantingLetter) {
                throw new ParseException(s, c);
            }
            wantingLetter = !wantingLetter;
        }

    }


}
