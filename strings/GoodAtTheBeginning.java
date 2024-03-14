package strings;
//Write a method accepting a string and returning a boolean value. 
//The function returns true if "good" appears at the beginning of the string (see String.charAt() method).
public class GoodAtTheBeginning {

    public static boolean goodAtTheBeginning(String string) {
        boolean good = false;
        if (string.charAt(0) == 'g' && string.charAt(1) == 'o' && string.charAt(2) == 'o' && string.charAt(3) == 'd') {
            return true;
        }

        return good;
    }
}
