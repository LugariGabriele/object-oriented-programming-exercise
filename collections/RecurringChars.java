package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a method accepting a string and returning a set comprising all recurring characters of the string.
 * <p>
 * Examples:
 * <p>
 * recurringChars("Ciao") → []
 * recurringChars("Hello") → ['l']
 * recurringChars("Hello World!") → ['l', 'o']
 */
public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (char c : string.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
            } else {
                duplicate.add(c);
            }
        }

        return duplicate;
    }
}
