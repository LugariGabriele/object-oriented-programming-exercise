package array;

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
