package strings;
// Write a method accepting a string, and returning true if the number of appearances
// of "is" anywhere in the string is equal to the number of appearances of "not" anywhere
// in the string (case sensitive) (See String.indexOf()).
public class EqualIsNot {
    public static int countMatch(String place, String word ) {
        int count = 0;
        int index = 0; // serve per far capire da che posizione far partire l'index
        while (true) {
            index = place.indexOf(word, index); // cerca word in place e riporta la posizione della prima trovata, se non trova dà -1
            // in questo caso essendo un ciclo parte da 0 poi riparte a ceracre da dove siera fermato ecc..

            if (index!=-1){
                count ++;

            }
            else // per far fermare ciclo
                break;
        }
    return count;
    }
    public static boolean equalIsNot(String string){
    return countMatch(string,"is") == countMatch(string,"not");
    }
}
