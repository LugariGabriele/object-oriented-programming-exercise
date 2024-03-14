package strings;

public class DuplicateChars {
    public static char[] duplicateChars(String string) {
        StringBuilder seen = new StringBuilder();
        StringBuilder recurring = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            String tmp = String.valueOf(string.charAt(i)); //creo una stringa che contiene solo il carattere appena letto
            if ((!seen.toString().contains(tmp))) { //controllo che tmp non sia una lettera già vista
                seen.append(tmp);
            } else if (!recurring.toString().contains(tmp)) {
                recurring.append(tmp);
            }
        }
        char[] result = recurring.toString().toCharArray();
        java.util.Arrays.sort(result); //ordiniamo array
        return result;
    }
}
