package strings;
//Write a method accepting a string and returning true if "good" appears 
//either at index 0 or 1 of the given string (see String.startsWith() method).
public class GoodAroundTheBeginning {

    public static boolean goodAroundTheBeginning(String string) {
        boolean good = false;
        if (string.startsWith("good") || string.startsWith("good", 1))// il secondo controlla se è nello spazio 1
        {
            good = true;
        }
   return good;
    }


}
