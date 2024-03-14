package strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string) {
        if (string.length() < 2) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < string.length(); i++) { //dato che i primi due non mi servono lo faccio partire da 2
            sb.append(sb.charAt(i));

        }

        return sb.toString();

    }
}
