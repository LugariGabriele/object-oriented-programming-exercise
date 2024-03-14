package strings;

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
