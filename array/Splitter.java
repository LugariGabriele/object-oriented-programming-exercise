package array;
//Write a method accepting an int and returning the sequence of the digits as an int[].

/*Examples:

321 → [3, 2, 1]
123 → [1, 2, 3]
 */
public class Splitter {
    public static int[] splitter(int input){
    String StringNumbers= Integer.toString(input);
    int lenght= StringNumbers.length();
    int [] array = new int [lenght];
        for (int i = 0; i <lenght ; i++) {
        array[i]=Character.getNumericValue(StringNumbers.charAt(i));
        }

        return array;
    }
}
