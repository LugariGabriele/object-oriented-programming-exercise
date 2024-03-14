package strings;
//Write a method accepting a string and returning all recurring characters contained into the string as a char[]. More specifically, recurring characters 
//have to be returned in alphabetical order (see String.valueOf(), String.contains(), String.toCharArray()). 
//For example: headmistressship -> [e,h,i,s].
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
