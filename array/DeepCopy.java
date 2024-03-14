package array;
/*Write a method accepting an int[][] and returning a deep copy of the original. 
Deep copies differ from shallow copies in that the whole multidimensional array is duplicated instead of the first tier of pointers only.
    */
import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int [][] copy=new int[original.length][]; //primo [] righe secondo colonne
        for (int i = 0; i < original.length ; i++) {
            copy[i]= Arrays.copyOf(original[i],original.length);
        }

        return copy;
    }
}
