package math;

/**
 * Created by lancer on 2017/1/31.
 */
public class Matrix {

    /**
     * 点向量相乘
     *
     * @param x
     * @param y
     * @return
     */
    public static double dot(double[] x, double[] y) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                sum += x[i] * y[j];
            }
        }
        return sum;
    }
}
