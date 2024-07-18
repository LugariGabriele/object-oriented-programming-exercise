package functional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has "y" added at its end,
 * omitting any resulting strings that contain "yy" as a substring anywhere.
 *
 * Examples:
 *
 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
 * noYY(["a", "b", "cy"]) → ["ay", "by"]
 * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 * The method has the following prototype:
 *
 * public static List<String> noYY(List<String> strings);
 */
public class NoYY {
    public static List<String> noYY(List<String> strings){
        return strings.stream().map(s->s+"y").filter(s->!s.contains("yy")).collect(Collectors.toList());
    }
}
