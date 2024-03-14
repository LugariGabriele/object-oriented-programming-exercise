package strings;
//Write a method accepting a string and returning the same string 
//without the first two characters. Keep the first character if it is 'H' 
//and keep the second character if it is 'e' (see StringBuilder class).
public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String string) {
        StringBuilder sb = new StringBuilder();
        switch (string.length()) { //usaimo lunghezza dato che
            //switch fa sempre default
            case 0:{
                return "";
            }

            case 1: {
                if (string.charAt(0) == 'H') {
                    sb.append("H");
                }

            }
            case 2: {
                if (string.charAt(0) == 'H') {
                    sb.append("H");
                }
                if (string.charAt(1) == 'e') {
                    sb.append("e");
                }
            }

            default: {
                sb.append(string.substring(2));//Returns a string that is a substring of this string.
                // The substring begins with the character at the specified index and extends to the end of this string.
            }
        }


    return sb.toString();
    }





}
