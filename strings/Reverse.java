package strings;

public class Reverse {
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i < 0; i++) { //torniamo indietro dall' ultima posizione fino a 0
            sb.append(string.charAt(i)); //metto in sb il valore di i
        }
        return sb.toString();
    }
}
