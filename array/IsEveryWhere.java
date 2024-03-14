package array;
/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.

Examples:

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
    */
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
