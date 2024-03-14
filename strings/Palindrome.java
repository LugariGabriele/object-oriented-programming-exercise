package strings;

public class Palindrome {// una stringa è palindroma se è uguale sia se letta da sx che da dx

    public static boolean isPalindrome(String string) {
        if (string.isEmpty()) {
            return true;
        }
        String rev = new StringBuilder(string).reverse().toString(); //creo la reverse di string
        return string.equalsIgnoreCase(rev); // confronta il contenuto ignorando maiusole-minuscole
    }
}
