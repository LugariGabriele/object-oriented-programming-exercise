package array;
//Write a method accepting an int[] eventually containing zeros 
//and returning an int[] in which all the zeros are at the end of the array. 
//Maintain the relative order of the other (non-zero) elements.
public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v) {
        int tmp;
        for (int i = v.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (v[j] == 0 && v[j + 1] != 0) {
                   tmp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = tmp;
                }
            }


        }
        return v;
    }

}
