package array;

import java.util.Arrays;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched){
       boolean find= false;
        for (String string : strings) {
            if (string.equals(searched)) {
                find = true;
                break;
            }
        }
        return find;
    }
    public static boolean containsBinary(String[] strings, String searched){
        String[] soarted= Arrays.copyOf(strings,strings.length); // sito link array
        Arrays.sort(soarted);
        //se abbiamo array ordinato possiamo usare binary search che Note that this
        // guarantees that the return value will be >= 0 if and only if the key is found.
        return Arrays.binarySearch(soarted,searched)>=0;



    }
}
