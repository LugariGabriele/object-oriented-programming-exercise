package strings;

public class RemoveFirstLast {
    public static String removeFirstLast(String string) {

        char first = string.charAt(0);
        char last = string.charAt(string.length() - 1);
        if (first == last) {
            return string.substring(1, string.length() - 1);
        } else {
            return string;
        }
    }
}
