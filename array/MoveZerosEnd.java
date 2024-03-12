package array;

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
