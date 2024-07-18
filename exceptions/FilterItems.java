package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Using the checkString() method, write another method for filtering a List.
 * The method returns a different List comprising only those strings which are an alternating sequence of letters and numbers (for example a0b3h4z1r4).
 * The original list is not modified. The method has the following prototype:
 * <p>
 * public static List<String> filterItems(List<String> strings);
 */
public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> dst = new ArrayList<>();
        for (String string : strings) {
            try {
                CheckString.checkString(string);
                dst.add(string);
            }
            catch (ParseException ignored) {

            }


        }
        return dst;
    }
}