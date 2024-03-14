package strings;

public class GoodAtTheBeginning {

    public static boolean goodAtTheBeginning(String string) {
        boolean good = false;
        if (string.charAt(0) == 'g' && string.charAt(1) == 'o' && string.charAt(2) == 'o' && string.charAt(3) == 'd') {
            return true;
        }

        return good;
    }
}
