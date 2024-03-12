package array;

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
