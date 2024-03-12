package array;

public class BubbleSort {

    public static void bubbleSort(int[] v) {

        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    int tmp;
                    tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                    change = true;
                }
            }

        }


    }

    public static int[] bubbleSortCopy(int[] v) {

        int[] newv = new int[v.length];
        System.arraycopy(v, 0, newv, 0, v.length);
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < newv.length - 1; i++) {
                if (newv[i] > newv[i + 1]) {
                    int tmp;
                    tmp = newv[i];
                    newv[i] = newv[i + 1];
                    newv[i + 1] = tmp;
                    change = true;
                }
            }

        }
        return newv;
    }
}
