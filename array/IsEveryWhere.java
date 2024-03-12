package array;

public class IsEveryWhere {
    public static boolean isEverywhere(int[] v, int value) {
        boolean ovunque = true;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] != value && v[i + 1] != value) {
                ovunque = false;
                break;
            }
        }
        return ovunque;
    }
}
