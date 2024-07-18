package exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Using the checkString() method, write another method for filtering a List<List> (a list of lists of strings).
 * The method returns a List<List> comprising only those List containing ONLY alternating sequences of letters and numbers (for example a0b3h4z1r4).
 * The original List should not be modified. The method has the following prototype:
 * <p>
 * public static List<List<String>> filterLists(List<List<String>> lists);
 */
public class FilterLists {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> dst = new ArrayList<>();

        for (List<String> list : lists) {
            try {
                for (String s : list) {
                    CheckString.checkString(s);
                }
                dst.add(list);

            } catch (ParseException ignored) {

            }
        }
        return dst;
    }
}
