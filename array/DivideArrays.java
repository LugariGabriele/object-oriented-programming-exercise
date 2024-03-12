package array;

public class DivideArrays {

    public static double[] divideArrays(double[] v1, double[] v2) {
        double[] div = new double[v1.length];

        if (v1.length != v2.length) {
            return null;
        } else {
            for (int i = 0; i < div.length; i++) {
                div[i] = v1[i] / v2[i];
            }
        }
        return div;
    }

}
